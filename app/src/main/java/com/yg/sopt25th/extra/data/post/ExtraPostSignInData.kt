package com.yg.sopt25th.extra.data.post

import com.google.gson.annotations.SerializedName

data class ExtraPostSignInData (
    @SerializedName("userIdx")
    var userIdx : Int,
    @SerializedName("id")
    var id : String,
    @SerializedName("password")
    var pwd : String,
    @SerializedName("name")
    var name : String,
    @SerializedName("phone")
    var phone : String
)