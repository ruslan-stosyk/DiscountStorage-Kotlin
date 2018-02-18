package com.stosh.discountstorage.activity

import android.os.Bundle
import com.stosh.discountstorage.App
import com.stosh.discountstorage.R
import com.stosh.discountstorage.contract.activity.AuthActivityContract


/**
 * @author Ruslan Stosyk
 * Date: February, 18, 2018
 * Time: 4:16 PM
 */
class AuthActivity : BaseActivity<AuthActivityContract.Actions>(),
        AuthActivityContract.Views {

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as App).getAuthComponent().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
    }
}