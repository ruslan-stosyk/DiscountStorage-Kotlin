package com.stosh.discountstorage.dagger.module

import android.content.Context
import com.stosh.discountstorage.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


/**
 * @author Ruslan Stosyk
 * Date: February, 17, 2018
 * Time: 9:02 PM
 */

@Module
class AppModule(val app: App) {

    @Provides
    @Singleton
    fun app(): App {
        return app
    }

    @Provides
    @Singleton
    fun context(): Context {
        return app.applicationContext
    }
}