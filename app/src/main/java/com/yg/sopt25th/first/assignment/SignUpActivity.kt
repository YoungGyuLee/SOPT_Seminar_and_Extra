package com.yg.sopt25th.first.assignment

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yg.first.R
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        signInBtnSign.setOnClickListener {
            val intent = Intent(this, SignActivity::class.java)
            intent.putExtra("id", signInEdtId.text.toString())
            intent.putExtra("pwd", signInEdtPwd.text.toString())
            setResult(2000, intent)
            finish()
        }
    }
}
