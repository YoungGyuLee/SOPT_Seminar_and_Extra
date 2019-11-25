package com.yg.sopt25th.extra.ui.fragment


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.yg.first.R
import kotlinx.android.synthetic.main.fragment_extra_third.*

/**
 * A simple [Fragment] subclass.
 */
class ExtraThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.v("frg", "3")
        return inflater.inflate(R.layout.fragment_extra_third, container, false)
    }

    override fun onStart() {
        super.onStart()
        frg_tv_third.setOnClickListener {
            Toast.makeText(context, "3번입니다", Toast.LENGTH_SHORT).show()
        }
    }


}
