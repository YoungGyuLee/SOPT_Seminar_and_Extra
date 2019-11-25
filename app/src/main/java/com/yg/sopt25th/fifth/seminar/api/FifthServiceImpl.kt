package com.yg.sopt25th.fifth.seminar.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object FifthServiceImpl {
    private const val BASE_URL = "http://106.10.59.71:3000/"

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service = retrofit.create(FifthService::class.java)
}
