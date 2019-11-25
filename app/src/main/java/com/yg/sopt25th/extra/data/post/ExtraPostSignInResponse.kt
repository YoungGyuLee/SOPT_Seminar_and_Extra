package com.yg.sopt25th.extra.data.post

import com.google.gson.annotations.SerializedName

data class ExtraPostSignInResponse (
    @SerializedName("success")
    var success : Boolean,
    @SerializedName("message")
    var message : String,
    @SerializedName("data")
    var data : ExtraPostSignInData
)