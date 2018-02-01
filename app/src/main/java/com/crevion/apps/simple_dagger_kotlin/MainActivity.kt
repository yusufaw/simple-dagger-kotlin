package com.crevion.apps.simple_dagger_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mPreferencesUtil: PreferencesUtil

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CustomApp.mInstance.applicationComponent.inject(this)
        setContentView(R.layout.activity_main)

        val hello: String = mPreferencesUtil.getString("hello", "hello")
        Toast.makeText(this, hello, Toast.LENGTH_LONG).show()
    }
}
