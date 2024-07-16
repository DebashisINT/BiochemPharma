package com.breezebiochemph.features.leaderboard.api

import com.breezebiochemph.app.NetworkConstant
import com.breezebiochemph.base.BaseResponse
import com.breezebiochemph.features.addshop.model.AddShopRequestData
import com.breezebiochemph.features.addshop.model.AddShopResponse
import com.breezebiochemph.features.addshop.model.LogFileResponse
import com.breezebiochemph.features.addshop.model.UpdateAddrReq
import com.breezebiochemph.features.contacts.CallHisDtls
import com.breezebiochemph.features.contacts.CompanyReqData
import com.breezebiochemph.features.contacts.ContactMasterRes
import com.breezebiochemph.features.contacts.SourceMasterRes
import com.breezebiochemph.features.contacts.StageMasterRes
import com.breezebiochemph.features.contacts.StatusMasterRes
import com.breezebiochemph.features.contacts.TypeMasterRes
import com.breezebiochemph.features.login.model.WhatsappApiData
import com.breezebiochemph.features.login.model.WhatsappApiFetchData
import io.reactivex.Observable
import okhttp3.MultipartBody
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

/**
 * Created by Puja on 12-40-2014.
 */
interface LeaderboardApi {

    @FormUrlEncoded
    @POST("LeaderboardInfo/LeaderboardBranchLists")
    fun branchList(@Field("session_token") session_token: String): Observable<LeaderboardBranchData>

    @FormUrlEncoded
    @POST("LeaderboardInfo/LeaderboardOwnList")
    fun ownDatalist(@Field("user_id") user_id: String,@Field("activitybased") activitybased: String,@Field("branchwise") branchwise: String,@Field("flag") flag: String): Observable<LeaderboardOwnData>

    @FormUrlEncoded
    @POST("LeaderboardInfo/LeaderboardOverallList")
    fun overAllDatalist(@Field("user_id") user_id: String,@Field("activitybased") activitybased: String,@Field("branchwise") branchwise: String,@Field("flag") flag: String): Observable<LeaderboardOverAllData>


    /**
     * Companion object to create the GithubApiService
     */
    companion object Factory {
        fun create(): LeaderboardApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.ADD_SHOP_BASE_URL)
                    .build()

            return retrofit.create(LeaderboardApi::class.java)
        }

        fun createWithoutMultipart(): LeaderboardApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(LeaderboardApi::class.java)
        }
    }
}