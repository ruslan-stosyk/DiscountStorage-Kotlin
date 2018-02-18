package com.stosh.discountstorage.presenter.activity

import android.content.Context
import com.stosh.discountstorage.contract.activity.BaseActivityContract
import com.stosh.discountstorage.presenter.BasePresenter

/**
 * @author Ruslan Stosyk
 * Date: February, 18, 2018
 * Time: 3:01 PM
 */

abstract class BaseActivityPresenter<V : BaseActivityContract.BaseActivityViews>(context: Context) : BasePresenter<V>(context),
        BaseActivityContract.BaseActivityActions