package com.stosh.discountstorage.dagger.scope

import javax.inject.Qualifier
import javax.inject.Scope


/**
 * @author Ruslan Stosyk
 * Date: February, 17, 2018
 * Time: 9:35 PM
 */

@Qualifier
@Retention(value = AnnotationRetention.RUNTIME)
@Scope
annotation class MainScope