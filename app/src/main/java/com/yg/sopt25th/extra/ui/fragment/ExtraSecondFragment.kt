package com.yg.sopt25th.extra.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.yg.first.R
import com.yg.sopt25th.extra.ui.activity.ExtraSecondActivity
import kotlinx.android.synthetic.main.fragment_extra_second.*

class ExtraSecondFragment : Fragment() {
    var number = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.v("frg", "2")
        return inflater.inflate(R.layout.fragment_extra_second, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onStart() {
        super.onStart()
        frg_tv_second.setOnClickListener {
            Toast.makeText(context, "2번입니다", Toast.LENGTH_SHORT).show()
            (activity as ExtraSecondActivity).refresh()
        }

    }
}
