package com.yg.sopt25th.third.seminar.data

import com.google.gson.annotations.SerializedName

data class GitRepoOwner (
    @SerializedName("login")
    var login : String,
    @SerializedName("id")
    var id : Int,
    @SerializedName("site_admin")
    var siteAdmin : Boolean
)
