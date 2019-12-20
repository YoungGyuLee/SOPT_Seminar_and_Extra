package com.yg.sopt25th.extra.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ExtraServiceImpl {
    private const val BASE_URL = "https://reqres.in/"

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service : ExtraService = retrofit.create(ExtraService::class.java)
}
