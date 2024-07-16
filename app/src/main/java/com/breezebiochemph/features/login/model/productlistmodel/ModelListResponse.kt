package com.breezebiochemph.features.login.model.productlistmodel

import com.breezebiochemph.app.domain.ModelEntity
import com.breezebiochemph.app.domain.ProductListEntity
import com.breezebiochemph.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}