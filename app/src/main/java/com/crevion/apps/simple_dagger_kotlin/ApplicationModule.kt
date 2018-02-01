package com.crevion.apps.simple_dagger_kotlin

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by yusufaw on 2/1/18.
 */

@Module
class ApplicationModule(private val customApp: CustomApp) {

    @Provides
    @Singleton
    fun provideContext(): Context = customApp.applicationContext

    @Provides
    @Singleton
    fun providePreferencesUtil(sharedPreferences: SharedPreferences): PreferencesUtil = PreferencesUtil(sharedPreferences)

    @Provides
    @Singleton
    fun provideSharedPreferences(): SharedPreferences = provideContext().getSharedPreferences("", Context.MODE_PRIVATE)
}