package com.yg.sopt25th.fourth.seminar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yg.first.R

class FourthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        val fragment1 = FourthFragment()

        val fragment4 = FourthFragment()
        val fragment2 = FourthFragment()
        val fragment3 = FourthFragment()



    }
}
