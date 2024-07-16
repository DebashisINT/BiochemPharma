package com.breezebiochemph.features.viewAllOrder.orderOptimized

import com.breezebiochemph.app.domain.ProductOnlineRateTempEntity
import com.breezebiochemph.base.BaseResponse
import com.breezebiochemph.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}