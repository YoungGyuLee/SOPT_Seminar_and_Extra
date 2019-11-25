package com.yg.sopt25th.fifth.seminar.data

data class FifthGetItems (
    var status : Int,
    var success : Boolean,
    var message : String,
    var data : List<FifthGetItems>
)