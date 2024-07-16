package com.breezebiochemph.features.location.shopRevisitStatus

import com.breezebiochemph.features.location.shopdurationapi.ShopDurationApi
import com.breezebiochemph.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}