package com.yg.sopt25th.third.seminar.data

import com.google.gson.annotations.SerializedName

data class GitResponseData (
    @SerializedName("id")
    var id : Int,
    @SerializedName("node_id")
    var nodeId : String,
    @SerializedName("owner")
    var owner : GitRepoOwner,
    @SerializedName("html_url")
    var htmlUrl : String
)