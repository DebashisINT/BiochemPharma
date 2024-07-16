package com.breezebiochemph.features.viewAllOrder.interf

import com.breezebiochemph.app.domain.NewOrderGenderEntity
import com.breezebiochemph.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}