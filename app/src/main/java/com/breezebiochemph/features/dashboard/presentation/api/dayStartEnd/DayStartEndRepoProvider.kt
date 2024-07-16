package com.breezebiochemph.features.dashboard.presentation.api.dayStartEnd

import com.breezebiochemph.features.stockCompetetorStock.api.AddCompStockApi
import com.breezebiochemph.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}