package com.stosh.discountstorage.dagger.component

import com.stosh.discountstorage.dagger.module.AppModule
import com.stosh.discountstorage.dagger.module.AuthActivityModule
import dagger.Component
import javax.inject.Singleton


/**
 * @author Ruslan Stosyk
 * Date: February, 17, 2018
 * Time: 9:03 PM
 */

@Component(modules = [(AppModule::class)])
@Singleton
interface AppComponent {
    fun initAuthComponent(module: AuthActivityModule): AuthActivityComponent
}
