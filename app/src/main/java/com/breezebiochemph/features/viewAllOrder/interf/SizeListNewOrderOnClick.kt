package com.breezebiochemph.features.viewAllOrder.interf

import com.breezebiochemph.app.domain.NewOrderProductEntity
import com.breezebiochemph.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}