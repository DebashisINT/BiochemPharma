package com.breezebiochemph.features.survey.api

import com.breezebiochemph.features.photoReg.api.GetUserListPhotoRegApi
import com.breezebiochemph.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}