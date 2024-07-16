package com.breezebiochemph.features.weather.api

import com.breezebiochemph.base.BaseResponse
import com.breezebiochemph.features.task.api.TaskApi
import com.breezebiochemph.features.task.model.AddTaskInputModel
import com.breezebiochemph.features.weather.model.ForeCastAPIResponse
import com.breezebiochemph.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}