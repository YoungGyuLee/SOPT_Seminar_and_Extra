package com.yg.sopt25th.first.seminar.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yg.first.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.practice.button
import kotlinx.android.synthetic.main.practice.textView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            textView.text = editText.text
        }
    }
}
