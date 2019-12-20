package com.yg.sopt25th.extra.data.get

import com.google.gson.annotations.SerializedName

data class GetUsersPageResponse (
    var page : Int,
    @SerializedName("per_page")
    var perPage : Int,
    var total : Int,
    @SerializedName("total_pages")
    var totalPages : Int,
    var data : List<GetUsersPageResponseData>
)


data class GetUsersPageResponseData(
    var id : Int,
    var email : String,
    @SerializedName("first_name")
    var firstName : String,
    @SerializedName("last_name")
    var lastName : String,
    var avatar : String
)


data class GetUserSingleResponse(
    var data : GetUserSingleData
)

data class GetUserSingleData(
    var id : Int,
    var email : String,
    @SerializedName("first_name")
    var firstName : String,
    @SerializedName("last_name")
    var lastName : String,
    var avatar: String
)

