package com.stosh.discountstorage.dagger.module

import android.content.Context
import com.stosh.discountstorage.contract.activity.AuthActivityContract
import com.stosh.discountstorage.dagger.scope.AuthActivityScope
import com.stosh.discountstorage.presenter.activity.AuthActivityPresenter
import dagger.Module
import dagger.Provides


/**
 * @author Ruslan Stosyk
 * Date: February, 17, 2018
 * Time: 9:06 PM
 */

@Module
class AuthActivityModule {

    @Provides
    @AuthActivityScope
    fun provideAuthActivityAction(context: Context): AuthActivityContract.Actions {
        return AuthActivityPresenter(context)
    }
}