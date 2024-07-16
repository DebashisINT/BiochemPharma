package com.breezebiochemph.features.lead.api

import com.breezebiochemph.features.NewQuotation.api.GetQuotListRegRepository
import com.breezebiochemph.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}