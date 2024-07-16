package com.breezebiochemph.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezebiochemph.app.FileUtils
import com.breezebiochemph.app.Pref
import com.breezebiochemph.base.BaseResponse
import com.breezebiochemph.features.addshop.model.AddLogReqData
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
import com.breezebiochemph.features.dashboard.presentation.DashboardActivity
import com.breezebiochemph.features.login.model.WhatsappApiData
import com.breezebiochemph.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}