package com.stosh.discountstorage.dagger.component

import com.stosh.discountstorage.dagger.module.AppModule
import com.stosh.discountstorage.dagger.module.MainModule
import dagger.Component
import javax.inject.Singleton


/**
 * @author Ruslan Stosyk
 * Date: February, 17, 2018
 * Time: 9:03 PM
 */

@Singleton
@Component(modules = [(AppModule::class)])
interface AppComponent {
    fun initMainComponent(module: MainModule): MainComponent
}
