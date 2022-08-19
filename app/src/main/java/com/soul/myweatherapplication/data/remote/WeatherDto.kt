package com.soul.myweatherapplication.data.remote

import com.soul.myweatherapplication.data.remote.WeatherDataDto
import com.squareup.moshi.Json

data class WeatherDto(
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
)
