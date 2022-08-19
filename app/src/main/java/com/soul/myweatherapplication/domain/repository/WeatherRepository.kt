package com.soul.myweatherapplication.domain.repository

import com.soul.myweatherapplication.domain.util.Resource
import com.soul.myweatherapplication.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}