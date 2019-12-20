package com.yg.sopt25th.extra.data.post


data class PostUser(
    var name : String,
    var job : String
)

data class PostUserResponse(
    var name : String,
    var job : String,
    var id : String,
    var createdAt : String
)
