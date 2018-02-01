package com.crevion.apps.simple_dagger_kotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*
import javax.inject.Inject

class HomeActivity : AppCompatActivity() {

    @Inject
    lateinit var mPreferencesUtil: PreferencesUtil


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)

        CustomApp.mInstance.applicationComponent.inject(this)

        mPreferencesUtil.putString("hello", "Halo Dunia!!!")
        fab.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)) }
    }
}
