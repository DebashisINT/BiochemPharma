package com.breezebiochemph.features.location.api

import com.breezebiochemph.features.location.shopdurationapi.ShopDurationApi
import com.breezebiochemph.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}