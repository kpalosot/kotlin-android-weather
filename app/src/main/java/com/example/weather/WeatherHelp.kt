package com.example.weather

import retrofit2.Call
import retrofit2.http.GET

interface WeatherAPI{
    @GET()
    fun getForecast() : Call<List<Forecast>>
}

class Forecast(val high: String, val low: String)