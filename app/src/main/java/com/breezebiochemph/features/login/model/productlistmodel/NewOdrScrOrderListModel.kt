package com.breezebiochemph.features.login.model.productlistmodel

import com.breezebiochemph.app.domain.NewOrderScrOrderEntity
import com.breezebiochemph.app.domain.ProductListEntity

class NewOdrScrOrderListModel {
    var status:String? = null
    var message:String? = null
    var user_id:String? = null
    var order_list: ArrayList<NewOrderScrOrderEntity>? = null
}