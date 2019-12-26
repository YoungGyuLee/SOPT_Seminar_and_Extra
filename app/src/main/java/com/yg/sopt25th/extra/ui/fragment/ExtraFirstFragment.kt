package com.yg.sopt25th.extra.ui.fragment


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.yg.first.R
import com.yg.sopt25th.appjam.AppJamActivity
import com.yg.sopt25th.extra.ui.activity.ExtraSecondActivity
import com.yg.sopt25th.extra.ui.activity.TestObject
import kotlinx.android.synthetic.main.fragment_extra_first.*


class ExtraFirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.v("frg", "1")
        return inflater.inflate(R.layout.fragment_extra_first, container, false)
    }

    override fun onStart() {
        super.onStart()
        
        frg_tv_first.setOnClickListener {
            Toast.makeText(context, "1번입니다", Toast.LENGTH_SHORT)
                .show()
        }

        frg_tv_first2.setOnClickListener {
            startActivity(Intent(context, ExtraSecondActivity::class.java))
        }

        first_test_btn.setOnClickListener {
            first_test_btn.setBackgroundColor(resources.getColor(R.color.colorAccent))
            TestObject.testString = "222222"

            startActivityForResult(Intent(activity, AppJamActivity::class.java), 1000)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 1000){
            Toast.makeText(context, data?.getStringExtra("id"), Toast.LENGTH_SHORT).show()
        }
    }




}
