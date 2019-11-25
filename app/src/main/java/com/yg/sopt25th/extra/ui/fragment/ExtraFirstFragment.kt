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
import com.yg.sopt25th.extra.ui.activity.ExtraSecondActivity
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
    }



}