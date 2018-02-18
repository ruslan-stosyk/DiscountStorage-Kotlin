package com.stosh.discountstorage.presenter

import android.content.Context
import android.support.annotation.StringRes
import android.util.Log
import com.stosh.discountstorage.contract.BaseContract
import com.stosh.domain.interactor.BaseInteractor


/**
 * @author Ruslan Stosyk
 * Date: February, 18, 2018
 * Time: 2:44 PM
 */

@Suppress("UNCHECKED_CAST")
abstract class BasePresenter<V : BaseContract.BaseViews>(context: Context) : BaseContract.BaseActions {
    protected val TAG = this.javaClass.simpleName

    protected var mAppContext: Context = context
    protected var mView: V? = null

    override fun <View : BaseContract.BaseViews> onViewAttached(view: View) {
        Log.d(TAG, "onViewAttached ----> Was Attached")
        mView = view as V
    }

    override fun onViewDetached() {
        Log.d(TAG, "onViewDetached -----> view was detached")
        mView = null
    }

    override fun onViewDestroyed() {
        Log.d(TAG, "onViewDestroyed ----> view was destroyed")
        release()
    }

    fun releaseInteractor(vararg interactors: BaseInteractor) {
        for (interactor in interactors) {
            interactor.release()
        }
    }

    fun isViewAttached(): Boolean {
        return mView != null
    }

    fun str(@StringRes id: Int): String {
        return mAppContext.getString(id)
    }
}