package com.breezebiochemph.features.viewAllOrder.model

import com.breezebiochemph.app.domain.NewOrderColorEntity
import com.breezebiochemph.app.domain.NewOrderGenderEntity
import com.breezebiochemph.app.domain.NewOrderProductEntity
import com.breezebiochemph.app.domain.NewOrderSizeEntity
import com.breezebiochemph.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

