package com.breezebiochemph.features.mylearning.apiCall

import com.breezebiochemph.features.login.api.opportunity.OpportunityListApi
import com.breezebiochemph.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}