package com.breezebiochemph.features.orderList.model

import com.breezebiochemph.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}