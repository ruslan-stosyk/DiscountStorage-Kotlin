package com.stosh.discountstorage.contract


/**
 * @author Ruslan Stosyk
 * Date: February, 17, 2018
 * Time: 10:02 PM
 */
abstract class BaseFragmentContract : BaseContract() {
    interface BaseFragmentAction : BaseActions

    interface BaseFragmentView : BaseView
}