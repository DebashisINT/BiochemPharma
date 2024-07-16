package com.breezebiochemph.features.document.api

import com.breezebiochemph.app.NetworkConstant
import com.breezebiochemph.base.BaseResponse
import com.breezebiochemph.features.document.model.DocumentListResponseModel
import com.breezebiochemph.features.document.model.DocumentTypeResponseModel
import com.breezebiochemph.features.dymanicSection.api.DynamicApi
import com.breezebiochemph.features.dymanicSection.model.DynamicResponseModel
import io.reactivex.Observable
import okhttp3.MultipartBody
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface DocumentApi {

    @FormUrlEncoded
    @POST("AttachmentDocumentType/DocumentType")
    fun getDocType(@Field("session_token") session_token: String, @Field("user_id") user_id: String): Observable<DocumentTypeResponseModel>

    @FormUrlEncoded
    @POST("AttachmentDocumentType/DocumentList")
    fun getDocList(@Field("session_token") session_token: String, @Field("user_id") user_id: String,@Field("type_id") type_id: String): Observable<DocumentListResponseModel>

    @Multipart
    @POST("AttachDocumnet/AddDocumnet")
    fun addEditDocument(@Query("data") activity: String, @Part attachment: List<MultipartBody.Part?>): Observable<BaseResponse>

   /* @Multipart
    @POST("AttachDocumnet/AddDocumnet")
    fun addEditDocument(@Query("data") activity: String, @Part attachment: MultipartBody.Part?): Observable<BaseResponse>*/


    @FormUrlEncoded
    @POST("AttachmentDocumentType/DeleteDocument")
    fun deleteDocument(@Field("session_token") session_token: String, @Field("user_id") user_id: String,
                      @Field("id") id: String): Observable<BaseResponse>


    /**
     * Companion object to create the GithubApiService
     */
    companion object Factory {
        fun create(): DocumentApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(DocumentApi::class.java)
        }

        fun createImage(): DocumentApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOutNoRetry())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.ADD_SHOP_BASE_URL)
                    .build()

            return retrofit.create(DocumentApi::class.java)
        }
    }
}