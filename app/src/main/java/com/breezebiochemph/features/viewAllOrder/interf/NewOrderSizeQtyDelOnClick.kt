package com.breezebiochemph.features.viewAllOrder.interf

import com.breezebiochemph.app.domain.NewOrderGenderEntity
import com.breezebiochemph.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}