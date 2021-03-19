package com.afarelramdani.calculator.Base

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<ActivityBinding : ViewDataBinding> : AppCompatActivity() {
    protected lateinit var bind: ActivityBinding
    protected var setLayout: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = DataBindingUtil.setContentView(this@BaseActivity, setLayout!!)
    }

    protected inline fun <reified ClassActivity> intents(context: Context) {
        context.startActivity(Intent(context, ClassActivity::class.java))
    }

}