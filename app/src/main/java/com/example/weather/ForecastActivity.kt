package com.example.weather

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ForecastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forecast)

        var listViewForecast = findViewById<ListView>(R.id.listView_forecast)

        var favDrinks = listOf<String>("bubble tea", "honeymansi", "coffee")

        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, favDrinks)

        listViewForecast.adapter = adapter
    }
}
