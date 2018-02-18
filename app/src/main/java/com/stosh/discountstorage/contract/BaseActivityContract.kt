package com.stosh.discountstorage.contract


/**
 * @author Ruslan Stosyk
 * Date: February, 17, 2018
 * Time: 9:44 PM
 */
abstract class BaseActivityContract : BaseContract() {

    interface BaseActivityActions : BaseActions {

        fun onResume()

        fun onStart()

        fun onStop()
    }

    interface BaseActivityView : BaseView
}