package com.stosh.discountstorage.fragmetn

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import com.stosh.discountstorage.activity.BaseActivity
import com.stosh.discountstorage.contract.fragment.BaseFragmentContract
import javax.inject.Inject


/**
 * @author Ruslan Stosyk
 * Date: February, 18, 2018
 * Time: 3:17 PM
 */
abstract class BaseFragment<A : BaseFragmentContract.BaseFragmentActions> :
        Fragment(),
        BaseFragmentContract.BaseFragmentViews {
    protected val TAG = javaClass.simpleName

    @Inject
    protected lateinit var mActions: A

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mActions.onViewAttached(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mActions.onViewDetached()
    }

    override fun onDetach() {
        super.onDetach()
        mActions.onViewDestroyed()
    }

    override fun showLoading() {
        (activity as BaseActivity<*>).showLoading()
    }

    override fun hideLoading() {
        (activity as BaseActivity<*>).hideLoading()
    }
}