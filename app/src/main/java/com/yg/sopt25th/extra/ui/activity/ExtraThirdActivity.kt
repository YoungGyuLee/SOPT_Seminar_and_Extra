package com.yg.sopt25th.extra.ui.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.yg.first.R
import com.yg.sopt25th.extra.api.ExtraServiceImpl
import com.yg.sopt25th.extra.data.get.GetUserSingleResponse
import com.yg.sopt25th.extra.data.get.GetUsersPageResponse
import com.yg.sopt25th.extra.data.post.PostUserResponse
import kotlinx.android.synthetic.main.activity_extra_third.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ExtraThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extra_third)

        //val get = ExtraServiceImpl.service.getUsers(2)
//        get.enqueue(object : Callback<GetUsersResponse> {
//            override fun onFailure(call: Call<GetUsersResponse>, t: Throwable) {
//            }
//
//            override fun onResponse(
//                call: Call<GetUsersResponse>,
//                response: Response<GetUsersResponse>
//            ) {
//                if(response.isSuccessful){
//                    Log.v("GET", response.body()!!.data.avatar)
//                }else{
//
//                }
//            }
//
//        })

        //val post = ExtraServiceImpl.service.postUsers(PostUsers("aaaa", "aaaa"))
//        post.enqueue(object : Callback<PostUsersResponse> {
//            override fun onFailure(call: Call<PostUsersResponse>, t: Throwable) {
//            }
//
//            override fun onResponse(
//                call: Call<PostUsersResponse>,
//                response: Response<PostUsersResponse>
//            ) {
//                if(response.isSuccessful){
//                    Log.v("post", response.body()!!.name)
//                }
//            }
//
//        })


        val userList = ExtraServiceImpl
            .service.getUsersList(2)
        userList.enqueue(object : Callback<GetUsersPageResponse>{
            override fun onFailure(call: Call<GetUsersPageResponse>, t: Throwable) {
                Log.v("GET", t.toString())
            }

            override fun onResponse(
                call: Call<GetUsersPageResponse>,
                response: Response<GetUsersPageResponse>
            ) {
                if(response.isSuccessful){
                    Log.v("GET", response.body()!!.data[1].firstName)
                }
            }
        })

        val userSingle = ExtraServiceImpl
            .service.getUserSingle(2)
        userSingle.enqueue(object : Callback<GetUserSingleResponse>{
            override fun onFailure(call: Call<GetUserSingleResponse>, t: Throwable) {
                Log.v("GET", t.toString())
            }

            override fun onResponse(
                call: Call<GetUserSingleResponse>,
                response: Response<GetUserSingleResponse>
            ) {
                if(response.isSuccessful){
                    Log.v("GET", response.body()!!.data.avatar)
                    Glide.with(this@ExtraThirdActivity)
                        .load(response.body()!!.data.avatar)
                        .into(image1212)
                }
            }
        })

        val postUser = ExtraServiceImpl.service
            .postUser("ygygyg", "090909")

        postUser.enqueue(object : Callback<PostUserResponse>{
            override fun onFailure(call: Call<PostUserResponse>, t: Throwable) {
                Log.v("POST", t.toString())
            }

            override fun onResponse(
                call: Call<PostUserResponse>,
                response: Response<PostUserResponse>
            ) {
                if(response.isSuccessful){
                    Log.v("POST", response.body()!!.name)
                }
            }

        })

    }
}
