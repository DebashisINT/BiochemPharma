package com.breezebiochemph.features.viewAllOrder.interf

import com.breezebiochemph.app.domain.NewOrderColorEntity
import com.breezebiochemph.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}