package com.stosh.discountstorage.contract.fragment

import com.stosh.discountstorage.contract.BaseContract


/**
 * @author Ruslan Stosyk
 * Date: February, 17, 2018
 * Time: 10:02 PM
 */
abstract class BaseFragmentContract : BaseContract() {

    interface BaseFragmentActions : BaseActions

    interface BaseFragmentViews : BaseViews
}