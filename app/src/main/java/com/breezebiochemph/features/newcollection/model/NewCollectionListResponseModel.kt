package com.breezebiochemph.features.newcollection.model

import com.breezebiochemph.app.domain.CollectionDetailsEntity
import com.breezebiochemph.base.BaseResponse
import com.breezebiochemph.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}