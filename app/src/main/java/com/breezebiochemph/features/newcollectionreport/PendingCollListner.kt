package com.breezebiochemph.features.newcollectionreport

import com.breezebiochemph.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}