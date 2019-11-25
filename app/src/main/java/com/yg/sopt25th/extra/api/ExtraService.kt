package com.yg.sopt25th.extra.api

import com.yg.sopt25th.extra.data.post.ExtraPostSignIn
import com.yg.sopt25th.extra.data.post.ExtraPostSignInResponse
import com.yg.sopt25th.extra.data.post.ExtraPostSignUp
import com.yg.sopt25th.extra.data.post.ExtraPostSignUpResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ExtraService {
    @POST("users/signin")
    fun postSignIn(
        @Body body : ExtraPostSignIn
    ) : Call<ExtraPostSignInResponse>

    @POST("users/signup")
    fun postSignUp(
        @Body body : ExtraPostSignUp
    ) : Call<ExtraPostSignUpResponse>


}