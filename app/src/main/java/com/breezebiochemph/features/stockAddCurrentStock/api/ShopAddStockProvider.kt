package com.breezebiochemph.features.stockAddCurrentStock.api

import com.breezebiochemph.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezebiochemph.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}