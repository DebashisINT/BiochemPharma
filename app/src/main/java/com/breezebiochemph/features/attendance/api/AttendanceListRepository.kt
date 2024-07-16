package com.breezebiochemph.features.attendance.api

import com.breezebiochemph.features.attendance.model.*
import io.reactivex.Observable

/**
 * Created by Pratishruti on 30-11-2017.
 */
class AttendanceListRepository(val apiService: AttendanceListApi) {
    fun getAttendanceList(attendanceRequest: AttendanceRequest?): Observable<AttendanceResponse> {
        return apiService.getAttendanceList(attendanceRequest)
    }

    fun getDayStartEndList(attendanceRequest: AttendanceRequest?): Observable<DayStartEndListResponse> {
        return apiService.getDayStartEndListAPI(attendanceRequest)
    }

    fun getNotVisitedPartyList(inputRequest: InputRequest?): Observable<OutputResponse> {
        return apiService.getPartyListNotVisited(inputRequest)
    }
}