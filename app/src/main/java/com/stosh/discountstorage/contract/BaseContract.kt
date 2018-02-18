package com.stosh.discountstorage.contract


/**
 * @author Ruslan Stosyk
 * Date: February, 17, 2018
 * Time: 9:41 PM
 */
abstract class BaseContract {

    interface BaseActions {
        fun <View : BaseView> onViewAttached(view: View)

        fun onViewDetached()

        fun onViewDestroyed()

        fun release()
    }

    interface BaseView {
        fun showDialog(title: String, message: String)

        fun showSnackBar(message: String)

        fun disableTouches(disable: Boolean)

        fun showLoading()

        fun hideLoading()
    }
}