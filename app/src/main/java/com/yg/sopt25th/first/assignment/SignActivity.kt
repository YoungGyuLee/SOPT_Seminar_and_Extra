package com.yg.sopt25th.first.assignment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.yg.first.R
import com.yg.sopt25th.first.seminar.login.MainActivity
import kotlinx.android.synthetic.main.activity_sign.*

class SignActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)

        sign_btn_login.setOnClickListener{
            if ((sign_edit_user.text.toString().isEmpty()) or
                (sign_edit_password.text.toString().isEmpty())){
                Toast.makeText(this, "빈 칸을 입력하세요", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this, MainActivity::class.java)
                val id = sign_edit_user.text.toString()
                val pwd = sign_edit_password.text.toString()
                intent.putExtra("id", id)
                intent.putExtra("pwd", pwd)
                startActivity(intent)
            }
        }

        sign_btn_sign.setOnClickListener {
            startActivityForResult(Intent(this, SignUpActivity::class.java),
                2000)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.v("result", resultCode.toString())
        if(requestCode == 2000){
            Log.v("eee","eeee")
            val id = data?.getStringExtra("id")
            //val name = intent.getStringExtra("name")
            val pwd = data?.getStringExtra("pwd")
            Log.v("id",id)

            sign_edit_user.setText(id)
            sign_edit_password.setText(pwd)
        }
    }
}
