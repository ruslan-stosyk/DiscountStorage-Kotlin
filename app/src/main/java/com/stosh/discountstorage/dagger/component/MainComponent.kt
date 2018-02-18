package com.stosh.discountstorage.dagger.component

import com.stosh.discountstorage.activity.BaseActivity
import com.stosh.discountstorage.dagger.module.MainModule
import com.stosh.discountstorage.dagger.scope.MainScope
import dagger.Component


/**
 * @author Ruslan Stosyk
 * Date: February, 17, 2018
 * Time: 9:07 PM
 */

@MainScope
@Component(modules = [(MainModule::class)])

interface MainComponent {
    fun inject(activity: BaseActivity)
}