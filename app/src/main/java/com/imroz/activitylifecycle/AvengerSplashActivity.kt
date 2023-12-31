package com.imroz.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class AvengerSplashActivity : AppCompatActivity() {

    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avenger_splash)

        handler= Handler()
        handler.postDelayed({
            val intent=Intent(this@AvengerSplashActivity,LoginActivity::class.java)
            startActivity(intent)
            finish()
        },2000)
    }
}