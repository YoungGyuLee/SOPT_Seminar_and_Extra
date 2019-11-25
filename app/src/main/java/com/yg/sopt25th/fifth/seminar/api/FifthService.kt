package com.yg.sopt25th.fifth.seminar.api

import com.yg.sopt25th.fifth.seminar.data.FifthGetAd
import com.yg.sopt25th.fifth.seminar.data.FifthGetItems
import com.yg.sopt25th.fifth.seminar.data.FifthGetUser
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface FifthService {
    @GET("users/{id}")
    fun getUserInfo(
        @Path("id") id : String
    ) : Call<FifthGetUser>

    @GET("goods")
    fun getGoodsInfo(
    ) : Call<FifthGetItems>

    @GET("ads/{id}")
    fun getAdsInfo(
        @Path("id") id : String
    ) : Call<FifthGetAd>
}
