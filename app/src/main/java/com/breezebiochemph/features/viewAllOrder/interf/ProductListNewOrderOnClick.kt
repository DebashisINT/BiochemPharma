package com.breezebiochemph.features.viewAllOrder.interf

import com.breezebiochemph.app.domain.NewOrderGenderEntity
import com.breezebiochemph.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}