package com.crevion.apps.simple_dagger_kotlin

import android.app.Application

/**
 * Created by yusufaw on 2/1/18.
 */

class CustomApp : Application() {
    companion object {
        lateinit var mInstance: CustomApp
    }

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        mInstance = this
        applicationComponent = initApplicationComponent()
    }

    private fun initApplicationComponent(): ApplicationComponent {
        return DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}