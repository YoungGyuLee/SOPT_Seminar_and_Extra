package com.yg.sopt25th.extra.data.get

import com.google.gson.annotations.SerializedName

data class GetUsersResponse (
    var data : GetUsersData
)


data class GetUsersData(
    var id : Int,
    var email : String,
    @SerializedName("first_name")
    var firstName : String,
    @SerializedName("last_name")
    var lastName : String,
    var avatar : String
)