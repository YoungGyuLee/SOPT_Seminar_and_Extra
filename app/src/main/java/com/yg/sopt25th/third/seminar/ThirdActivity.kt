package com.yg.sopt25th.third.seminar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yg.first.R
import com.yg.sopt25th.third.seminar.api.GithubServiceImpl
import com.yg.sopt25th.third.seminar.data.GitResponseData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val call = GithubServiceImpl
            .service.getRepo("YoungGyuLee")


        call.enqueue(object : Callback<List<GitResponseData>>{
            override fun onFailure(call: Call<List<GitResponseData>>, t: Throwable) {
            }

            override fun onResponse(
                call: Call<List<GitResponseData>>,
                response: Response<List<GitResponseData>>
            ) {
            }

        })

        call.enqueue(object : Callback<List<GitResponseData>>{
            override fun onFailure(call: Call<List<GitResponseData>>, t: Throwable) {
            }

            override fun onResponse(
                call: Call<List<GitResponseData>>,
                response: Response<List<GitResponseData>>
            ) {
            }

        })
    }
}
