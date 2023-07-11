package com.imroz.activitylifecycle

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class AvengersActivity : AppCompatActivity() {

    var titleName:String?="Avengers"
    lateinit var btnLogout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avengers)

        lateinit var sharedPreferences: SharedPreferences

        sharedPreferences= getSharedPreferences(getString(R.string.preferences_file_name), Context.MODE_PRIVATE)

        titleName=sharedPreferences.getString("Title", "The Avengers")
        title =titleName

        btnLogout=findViewById(R.id.btnLogout)

        btnLogout.setOnClickListener{
            sharedPreferences.edit().clear().apply()
            intent= Intent(this@AvengersActivity,LoginActivity::class.java)
            startActivity(intent)
            Toast.makeText(this@AvengersActivity,"Logged Out", Toast.LENGTH_LONG).show()
            finish()
        }

    }
}