package com.stosh.discountstorage.dagger.component

import com.stosh.discountstorage.activity.AuthActivity
import com.stosh.discountstorage.dagger.module.AuthActivityModule
import com.stosh.discountstorage.dagger.scope.AuthActivityScope
import dagger.Subcomponent


/**
 * @author Ruslan Stosyk
 * Date: February, 17, 2018
 * Time: 9:07 PM
 */

@Subcomponent(modules = [AuthActivityModule::class])
@AuthActivityScope
interface AuthActivityComponent {
    fun inject(activity: AuthActivity)
}