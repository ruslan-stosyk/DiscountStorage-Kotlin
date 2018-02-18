package com.stosh.discountstorage.presenter.activity

import android.content.Context
import com.stosh.discountstorage.contract.activity.AuthActivityContract


/**
 * @author Ruslan Stosyk
 * Date: February, 18, 2018
 * Time: 4:37 PM
 */
class AuthActivityPresenter(context: Context) : BaseActivityPresenter<AuthActivityContract.Views>(context),
        AuthActivityContract.Actions {

    override fun release() {
        releaseInteractor()
    }
}