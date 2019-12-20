package com.yg.sopt25th.extra.api

import com.yg.sopt25th.extra.data.get.GetUserSingleResponse
import com.yg.sopt25th.extra.data.get.GetUsersPageResponse
import com.yg.sopt25th.extra.data.get.GetUsersResponse
import com.yg.sopt25th.extra.data.post.*
import retrofit2.Call
import retrofit2.http.*

interface ExtraService {
    @POST("users/signin")
    fun postSignIn(
        @Body body : ExtraPostSignIn
    ) : Call<ExtraPostSignInResponse>

    @POST("users/signup")
    fun postSignUp(
        @Body body : ExtraPostSignUp
    ) : Call<ExtraPostSignUpResponse>


    @GET("api/users/{number}")
    fun getUsers(
        @Path("number") num : Int
    ) : Call<GetUsersResponse>


    @POST("api/users")
    fun postUsers(
        @Body body : PostUsers
    ) : Call<PostUsersResponse>



    @GET("api/users")
    fun getUsersList(
        @Query("page") page : Int
    ) : Call<GetUsersPageResponse>

    @GET("api/users/{number}")
    fun getUserSingle(
        @Path("number") number : Int
    ) : Call<GetUserSingleResponse>

    @FormUrlEncoded
    @POST("api/users")
    fun postUser(
        @Field("name") name : String,
        @Field("job") job : String
    ) : Call<PostUserResponse>

    @POST("api/users")
    fun postUser2(
        @Body body : PostUser
    ) : Call<PostUserResponse>

}
