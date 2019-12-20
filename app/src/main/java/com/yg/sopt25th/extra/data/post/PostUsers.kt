package com.yg.sopt25th.extra.data.post

data class PostUsers (
    var name : String,
    var job : String
)

data class PostUsersResponse(
    var name : String,
    var job : String,
    var id : String,
    var createdAt : String
)