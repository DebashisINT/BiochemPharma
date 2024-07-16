package com.breezebiochemph.features.weather.api

import com.breezebiochemph.features.task.api.TaskApi
import com.breezebiochemph.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}