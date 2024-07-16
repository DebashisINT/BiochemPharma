package com.breezebiochemph.features.document.api

import com.breezebiochemph.features.dymanicSection.api.DynamicApi
import com.breezebiochemph.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}