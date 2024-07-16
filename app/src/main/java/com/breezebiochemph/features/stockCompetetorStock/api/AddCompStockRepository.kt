package com.breezebiochemph.features.stockCompetetorStock.api

import com.breezebiochemph.base.BaseResponse
import com.breezebiochemph.features.orderList.model.NewOrderListResponseModel
import com.breezebiochemph.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezebiochemph.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}