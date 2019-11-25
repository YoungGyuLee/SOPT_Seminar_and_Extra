package com.yg.sopt25th.extra.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.yg.first.R
import com.yg.sopt25th.extra.ui.fragment.ExtraFirstFragment
import com.yg.sopt25th.extra.ui.fragment.ExtraSecondFragment
import com.yg.sopt25th.extra.ui.fragment.ExtraThirdFragment
import kotlinx.android.synthetic.main.activity_extra.*

class ExtraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extra)

//        extra_btn_up.setOnClickListener {
//            val body = ExtraPostSignUp(extra_edit_id.text.toString(),
//                extra_edit_pwd.text.toString(), extra_edit_name.text.toString(),
//                extra_edit_phone.text.toString())
//            Log.v("가입", extra_edit_id.text.toString())
//            val call = ExtraServiceImpl.service.postSignUp(body)
//
//            call.enqueue(object : Callback<ExtraPostSignUpResponse>{
//                override fun onFailure(call: Call<ExtraPostSignUpResponse>, t: Throwable) {
//                    Toast.makeText(this@ExtraActivity, "가입 실패2", Toast.LENGTH_SHORT).show()
//                    Log.v("가입 실패", t.toString())
//
//                }
//
//                override fun onResponse(
//                    call: Call<ExtraPostSignUpResponse>,
//                    response: Response<ExtraPostSignUpResponse>
//                ) {
//                    if(response.isSuccessful){
//                        Log.v("가입", response.body()!!.message)
//                        if(response.body()?.success!!){
//                            Toast.makeText(this@ExtraActivity, "가입 성공", Toast.LENGTH_SHORT).show()
//                        }
//                    }else{
//                        Log.v("가입 실패1", response.message())
//                        Toast.makeText(this@ExtraActivity, "가입 실패1", Toast.LENGTH_SHORT).show()
//                    }
//                }
//
//            })
//        }
//
//        extra_btn_in.setOnClickListener {
//            val body = ExtraPostSignIn(extra_edit_id.text.toString(),
//                extra_edit_pwd.text.toString())
//            val call = ExtraServiceImpl.service.postSignIn(body)
//
//            call.enqueue(object : Callback<ExtraPostSignInResponse>{
//                override fun onFailure(call: Call<ExtraPostSignInResponse>, t: Throwable) {
//                    Toast.makeText(this@ExtraActivity, "로그인 실패2", Toast.LENGTH_SHORT).show()
//                    Log.v("로그인 실패", t.toString())
//                }
//
//                override fun onResponse(
//                    call: Call<ExtraPostSignInResponse>,
//                    response: Response<ExtraPostSignInResponse>
//                ) {
//                    if(response.isSuccessful){
//                        if(response.body()?.success!!){
//                            Toast.makeText(this@ExtraActivity, "로그인 성공", Toast.LENGTH_SHORT).show()
//                        }
//                    }else{
//                        Toast.makeText(this@ExtraActivity, "로그인 실패1", Toast.LENGTH_SHORT).show()
//                    }
//                }
//
//            })
//        }

        addFragment(ExtraFirstFragment())
        extra_button1.setOnClickListener {
            replaceFragment(ExtraFirstFragment())
        }

        extra_button2.setOnClickListener {
            replaceFragment(ExtraSecondFragment())
        }

        extra_button3.setOnClickListener {
            replaceFragment(ExtraThirdFragment())
        }

    }

    fun addFragment(fragment : Fragment){
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        transaction.add(R.id.extra_frame, fragment)

        transaction.commit()
    }

    fun replaceFragment(fragment : Fragment){
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        transaction.replace(R.id.extra_frame, fragment)
        transaction.commit()
    }
}
