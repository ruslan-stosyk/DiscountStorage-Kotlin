package com.stosh.discountstorage.contract


/**
 * @author Ruslan Stosyk
 * Date: February, 17, 2018
 * Time: 9:41 PM
 */

abstract class BaseContract {

    interface BaseActions {
        fun <View : BaseViews> onViewAttached(view: View)

        fun onViewDetached()

        fun onViewDestroyed()

        fun release()
    }

    interface BaseViews {
        fun showLoading()

        fun hideLoading()
    }
}