package com.yg.sopt25th.fifth.seminar.data

import com.google.gson.annotations.SerializedName

data class FifthGetUserData (
    var idx : Int,
    var name : String,
    @SerializedName("skin_type")
    var skinType : String
)