package com.breezebiochemph.features.stockCompetetorStock.api

import com.breezebiochemph.app.NetworkConstant
import com.breezebiochemph.base.BaseResponse
import com.breezebiochemph.features.orderList.model.NewOrderListResponseModel
import com.breezebiochemph.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezebiochemph.features.stockAddCurrentStock.api.ShopAddStockApi
import com.breezebiochemph.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezebiochemph.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface AddCompStockApi {

    @POST("CompetitorStock/AddCompetitorStock")
    fun submShopCompStock(@Body shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest?): Observable<BaseResponse>

    @FormUrlEncoded
    @POST("CompetitorStock/CompetitorStockList")
    fun getCompStockList(@Field("session_token") session_token: String, @Field("user_id") user_id: String, @Field("date") date: String):
            Observable<CompetetorStockGetData>

    companion object Factory {
        fun create(): AddCompStockApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOutNoRetry())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(AddCompStockApi::class.java)
        }
    }

}