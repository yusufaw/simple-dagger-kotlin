package com.crevion.apps.simple_dagger_kotlin

import dagger.Component
import javax.inject.Singleton

/**
 * Created by yusufaw on 2/1/18.
 */

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun inject(target: MainActivity)
    fun inject(target: HomeActivity)
}