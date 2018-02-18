package com.stosh.discountstorage

import android.app.Application
import com.stosh.discountstorage.dagger.component.AppComponent
import com.stosh.discountstorage.dagger.component.AuthActivityComponent
import com.stosh.discountstorage.dagger.component.DaggerAppComponent
import com.stosh.discountstorage.dagger.module.AppModule
import com.stosh.discountstorage.dagger.module.AuthActivityModule


/**
 * @author Ruslan Stosyk
 * Date: February, 17, 2018
 * Time: 9:02 PM
 */

class App : Application() {


    private lateinit var mAppComponent: AppComponent
    private var mAuthActivityComponent: AuthActivityComponent? = null


    override fun onCreate() {
        super.onCreate()
        mAppComponent = DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }

    fun getAuthComponent(): AuthActivityComponent {
        if (mAuthActivityComponent == null) {
            mAuthActivityComponent = mAppComponent.initAuthComponent(AuthActivityModule())
        }
        return mAuthActivityComponent!!
    }

    fun releaseAuthComponent() {
        mAuthActivityComponent = null
    }
}
