package com.breezebiochemph.features.addAttendence.model

/**
 * Created by Saikat on 05-09-2018.
 */
class AddAttendenceInpuModel {
    var session_token = ""
    var user_id = ""
    var work_type = ""
    var work_desc = ""
    var work_lat = ""
    var work_long = ""
    var work_address = ""
    var work_date_time = ""
    var is_on_leave = ""
    var leave_from_date = ""
    var leave_to_date = ""
    var leave_type = ""
    var leave_reason = ""
    var route = ""
    var shop_list = ArrayList<AddAttendenceInputDataModel>()
    var add_attendence_time = ""
    var order_taken = "0"
    var collection_taken = "0"
    var new_shop_visit = "0"
    var revisit_shop = "0"
    var state_id = ""
    var primary_value_list = ArrayList<PrimaryValueDataModel>()
    var distributor_name = ""
    var market_worked = ""
    var update_plan_list = ArrayList<UpdatePlanListModel>()
    var from_id = ""
    var to_id = ""
    var distance = ""
    var beat_id = "0"
    var IsJointVisit = "false"
    var JointVisitTeam_MemberName = ""
    var JointVisitTeam_Member_User_ID = "0"
    var isDistributorwiseNearbyShopVisit = "No"

    //Begin Rev 7.0 AddAttendanceFragment AppV 4.1.3 Suman    17/05/2023 beat flow updation 26118
    var visit_location_id = ""
    var area_location_id = ""
    //End of Rev 7.0 AddAttendanceFragment AppV 4.1.3 Suman    17/05/2023 beat flow updation 26118
}