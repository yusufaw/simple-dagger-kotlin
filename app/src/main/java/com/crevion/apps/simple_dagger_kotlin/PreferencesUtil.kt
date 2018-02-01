package com.crevion.apps.simple_dagger_kotlin

import android.content.SharedPreferences
import javax.inject.Inject

/**
 * Created by yusufaw on 2/1/18.
 */

class PreferencesUtil @Inject constructor(private val sharedPreferences: SharedPreferences) {

    fun putInt(key: String, value: Int): Boolean {
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putInt(key, value)
        return editor.commit()
    }

    fun putBoolean(key: String, value: Boolean): Boolean {
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putBoolean(key, value)
        return editor.commit()
    }

    fun putString(key: String, value: String): Boolean {
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putString(key, value)
        return editor.commit()
    }

    fun getInt(key: String, defaultValue: Int): Int = sharedPreferences.getInt(key, defaultValue)
    fun getBoolean(key: String, defaultValue: Boolean): Boolean = sharedPreferences.getBoolean(key, defaultValue)
    fun getString(key: String, defaultValue: String): String = sharedPreferences.getString(key, defaultValue)
}