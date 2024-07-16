package com.breezebiochemph.features.photoReg.present

import com.breezebiochemph.app.domain.ProspectEntity
import com.breezebiochemph.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}