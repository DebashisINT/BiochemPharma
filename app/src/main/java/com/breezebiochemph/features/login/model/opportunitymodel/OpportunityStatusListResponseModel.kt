package com.breezebiochemph.features.login.model.opportunitymodel

import com.breezebiochemph.app.domain.OpportunityStatusEntity
import com.breezebiochemph.app.domain.ProductListEntity
import com.breezebiochemph.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}