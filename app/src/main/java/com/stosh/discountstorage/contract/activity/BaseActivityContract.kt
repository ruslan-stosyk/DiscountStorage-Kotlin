package com.stosh.discountstorage.contract.activity

import com.stosh.discountstorage.contract.BaseContract


/**
 * @author Ruslan Stosyk
 * Date: February, 17, 2018
 * Time: 9:44 PM
 */

abstract class BaseActivityContract : BaseContract() {

    interface BaseActivityActions : BaseActions

    interface BaseActivityViews : BaseViews
}