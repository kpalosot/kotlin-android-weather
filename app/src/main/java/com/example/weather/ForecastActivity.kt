package com.example.weather

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ForecastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forecast)

        var listViewForecast = findViewById<ListView>(R.id.listView_forecast)

        var favDrinks = listOf<String>("bubble tea", "honeymansi", "coffee")

        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, favDrinks)

        listViewForecast.adapter = adapter

        var retriever = WeatherRetriever()

        val callback = object : Callback<List<Forecast>> {
            override fun onFailure(call: Call<List<Forecast>>, t: Throwable) {
                println("CALL FAILED")
            }

            override fun onResponse(call: Call<List<Forecast>>, response: Response<List<Forecast>>) {
                println("RESPONSE RECEIVED")
                println(response?.body())

                for(forecastDay in response!!.body()!!){
                    println("High: ${forecastDay.high} Low: ${forecastDay.low}")
                }
            }

        }
        retriever.getForecast(callback)
    }
}
