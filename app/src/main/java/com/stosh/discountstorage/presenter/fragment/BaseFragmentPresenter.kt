package com.stosh.discountstorage.presenter.fragment

import android.content.Context
import com.stosh.discountstorage.contract.fragment.BaseFragmentContract
import com.stosh.discountstorage.presenter.BasePresenter

/**
 * @author Ruslan Stosyk
 * Date: February, 18, 2018
 * Time: 3:14 PM
 */

abstract class BaseFragmentPresenter<V : BaseFragmentContract.BaseFragmentViews>(context: Context) : BasePresenter<V>(context),
        BaseFragmentContract.BaseFragmentActions