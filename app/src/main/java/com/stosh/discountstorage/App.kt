package com.stosh.discountstorage

import android.app.Application
import android.net.ConnectivityManager
import android.util.Log
import com.stosh.discountstorage.dagger.component.AppComponent
import com.stosh.discountstorage.dagger.component.DaggerAppComponent
import com.stosh.discountstorage.dagger.module.AppModule
import javax.inject.Inject


/**
 * @author Ruslan Stosyk
 * Date: February, 17, 2018
 * Time: 9:02 PM
 */

class App : Application() {
    private val TAG = this.javaClass.name!!
    lateinit var component: AppComponent
    lateinit @Inject
    var cm: ConnectivityManager

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
        component.inject(this)
        Log.d(TAG, "connectivity manager : ${cm}")
    }
}
