package com.afarelramdani.calculator.Splash

class SplashPresenter(): SplashContract.Presenter{

    private var view: SplashContract.View? = null
    override fun bindToView(view: SplashContract.View) {
        this.view = view
    }

    override fun unbind() {
        this.view = null
    }
}