package com.yg.sopt25th.second.seminar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.yg.first.R

class SecondActivity : AppCompatActivity() {

    lateinit var secondAdapter: SecondAdapter
    lateinit var requestManager : RequestManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        requestManager = Glide.with(this)
        //secondAdapter = SecondAdapter(dad, )
    }
}
