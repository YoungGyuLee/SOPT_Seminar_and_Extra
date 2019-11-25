package com.yg.sopt25th.third.seminar.api

import com.yg.sopt25th.third.seminar.data.GitResponseData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {
    @GET("users/{username}/repos")
    fun getRepo(
        @Path("username") userName : String
    ) : Call<List<GitResponseData>>
}