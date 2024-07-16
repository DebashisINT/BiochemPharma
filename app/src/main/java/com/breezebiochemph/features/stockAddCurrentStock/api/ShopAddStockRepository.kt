package com.breezebiochemph.features.stockAddCurrentStock.api

import com.breezebiochemph.base.BaseResponse
import com.breezebiochemph.features.location.model.ShopRevisitStatusRequest
import com.breezebiochemph.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezebiochemph.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezebiochemph.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezebiochemph.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}