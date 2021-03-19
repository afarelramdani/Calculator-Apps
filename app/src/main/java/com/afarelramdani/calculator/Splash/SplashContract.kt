package com.afarelramdani.calculator.Splash

interface SplashContract {

    interface View {
        fun setCountdown()
        fun setError()
    }

    interface Presenter{
        fun bindToView(view: View)
        fun unbind()
    }
}