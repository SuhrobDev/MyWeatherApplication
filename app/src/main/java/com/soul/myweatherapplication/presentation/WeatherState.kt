package com.soul.myweatherapplication.presentation

import com.soul.myweatherapplication.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
