package com.example.weather

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var getForecast = findViewById<Button>(R.id.button_getForecast)

        getForecast.setOnClickListener{
            var newIntent = Intent(this, ForecastActivity::class.java)
            startActivity(newIntent)
        }
    }
}
