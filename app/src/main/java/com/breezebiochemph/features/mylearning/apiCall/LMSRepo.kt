package com.breezebiochemph.features.mylearning.apiCall

import com.breezebiochemph.features.login.api.opportunity.OpportunityListApi
import com.breezebiochemph.features.login.model.opportunitymodel.OpportunityStatusListResponseModel
import com.breezebiochemph.features.mylearning.TopicListResponse
import com.breezebiochemph.features.mylearning.VideoPlayLMS
import com.breezebiochemph.features.mylearning.VideoTopicWiseResponse
import io.reactivex.Observable

class LMSRepo(val apiService: LMSApi) {

    fun getTopics(user_id: String): Observable<TopicListResponse> {
        return apiService.getTopics(user_id)
    }

    fun getTopicsWiseVideo(topic_id: String): Observable<VideoTopicWiseResponse> {
        return apiService.getTopicswiseVideoApi(topic_id)
    }
}