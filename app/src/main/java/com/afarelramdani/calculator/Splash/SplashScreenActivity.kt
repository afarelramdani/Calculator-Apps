package com.afarelramdani.calculator.Splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.afarelramdani.calculator.Activity.CalculatorActivity
import com.afarelramdani.calculator.Base.BaseActivity
import com.afarelramdani.calculator.R
import com.afarelramdani.calculator.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : BaseActivity<ActivitySplashScreenBinding>(), SplashContract.View {
    private var presenter: SplashPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        setLayout = R.layout.activity_splash_screen
        super.onCreate(savedInstanceState)

        setCountdown()
    }

    override fun onStart() {
        super.onStart()
        presenter?.bindToView(this)
    }


    override fun onStop() {
        super.onStop()
        presenter?.unbind()
    }

    override fun setCountdown() {
        Handler(mainLooper).postDelayed({
            intents<CalculatorActivity>(this@SplashScreenActivity)
            finish()
        }, 2000)
    }

    override fun setError() {
    }
}