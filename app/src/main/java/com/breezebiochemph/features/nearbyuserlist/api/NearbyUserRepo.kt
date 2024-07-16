package com.breezebiochemph.features.nearbyuserlist.api

import com.breezebiochemph.app.Pref
import com.breezebiochemph.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezebiochemph.features.newcollection.model.NewCollectionListResponseModel
import com.breezebiochemph.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}