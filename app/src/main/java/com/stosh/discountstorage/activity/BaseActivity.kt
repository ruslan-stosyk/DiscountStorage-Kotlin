package com.stosh.discountstorage.activity

import android.content.Context
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.FrameLayout
import android.widget.ProgressBar
import com.stosh.discountstorage.R
import com.stosh.discountstorage.contract.BaseActivityContract
import kotlinx.android.synthetic.main.activity_base.*
import javax.inject.Inject

abstract class BaseActivity<out T : BaseActivityContract.BaseActivityActions> :
        AppCompatActivity(),
        BaseActivityContract.BaseActivityView {

    protected val TAG = this.javaClass.simpleName

    private val mMainProgressBar: ProgressBar = main_progress_bar

    @Inject
    protected val mActions: T? = null

    private var mDisableTouches: Boolean = false

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }

    override fun setContentView(@LayoutRes layoutResID: Int) {
        val mRootView = layoutInflater.inflate(R.layout.activity_base, null)
        super.setContentView(mRootView)
        val baseContentLayout = mRootView.findViewById<FrameLayout>(R.id.base_content_layout)
        val view = layoutInflater.inflate(layoutResID, null)
        baseContentLayout.addView(view)
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        mActions?.onViewAttached(this)
    }

    override fun onStart() {
        super.onStart()
        mActions?.onStart()
    }

    override fun onResume() {
        super.onResume()
        mActions?.onResume()
    }

    override fun onStop() {
        mActions?.onStop()
        super.onStop()
    }

    override fun onDetachedFromWindow() {
        mActions?.onViewDetached()
        super.onDetachedFromWindow()
    }

    override fun onDestroy() {
        mActions?.onViewDestroyed()
        super.onDestroy()
    }

    override fun showDialog(title: String, message: String) {

    }

    override fun showSnackBar(message: String) {

    }

    override fun disableTouches(disable: Boolean) {
        mDisableTouches = disable
    }

    override fun showLoading() {
        Log.d(TAG, "showLoading ----> Show")
        if (window != null && window.decorView != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(window.decorView.windowToken, 0)
        }
        disableTouches(true)
        mMainProgressBar.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        Log.d(TAG, "hideLoading ----> Hide")
        disableTouches(false)
        mMainProgressBar.visibility = View.GONE
    }

    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        return !mDisableTouches && super.dispatchTouchEvent(ev)
    }
}