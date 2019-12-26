package com.yg.sopt25th.extra.ui.activity

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.yg.first.R
import com.yg.sopt25th.extra.adapter.ExtraSecondAdapter
import com.yg.sopt25th.extra.data.ExtraSecondData
import com.yg.sopt25th.extra.ui.fragment.ExtraFirstFragment
import com.yg.sopt25th.extra.ui.fragment.ExtraFragmentAdapter
import com.yg.sopt25th.extra.ui.fragment.ExtraSecondFragment
import com.yg.sopt25th.extra.ui.fragment.ExtraThirdFragment
import kotlinx.android.synthetic.main.activity_extra_second.*
import kotlinx.android.synthetic.main.second_detail_layout.*

class ExtraSecondActivity : AppCompatActivity() {

    lateinit var extraSecondAdapter : ExtraSecondAdapter
    lateinit var extraSecondDatas : List<ExtraSecondData>
    lateinit var fragmentPageAdapter : ExtraFragmentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extra_second)
//        extraSecondDatas = listOf(
//            ExtraSecondData("1번", "1"),
//            ExtraSecondData("2번", "2"),
//            ExtraSecondData("3번", "3"),
//            ExtraSecondData("4번", "4"),
//            ExtraSecondData("5번", "5"),
//            ExtraSecondData("6번", "6"),
//            ExtraSecondData("7번", "7"),
//            ExtraSecondData("8번", "8"),
//            ExtraSecondData("9번", "9"),
//            ExtraSecondData("10번", "10"),
//            ExtraSecondData("11번", "11"),
//            ExtraSecondData("12번", "12")
//
//        )
//        extraSecondAdapter = ExtraSecondAdapter(extraSecondDatas, this)

//        extra_second_rv.layoutManager = LinearLayoutManager(this,
//            LinearLayoutManager.HORIZONTAL,
//            false
//        )

//        extra_second_rv.layoutManager = LinearLayoutManager(this,
//            LinearLayoutManager.HORIZONTAL, false)

        //extra_second_rv.layoutManager = GridLayoutManager(this,3)
//        extra_second_rv.adapter = extraSecondAdapter

        Log.v("Second", "Here")

        fragmentPageAdapter = ExtraFragmentAdapter(supportFragmentManager)

        fragmentPageAdapter.addFragments(ExtraFirstFragment())
        fragmentPageAdapter.addFragments(ExtraSecondFragment())
        fragmentPageAdapter.addFragments(ExtraThirdFragment())

        extra_second_vp.adapter = fragmentPageAdapter

        btn_extra_second_temp.setOnClickListener {
            layout_detail_selection.visibility = View.VISIBLE
        }

        btn_detail.setOnClickListener {
            btn_extra_second_temp.text = "선택함"
            layout_detail_selection.visibility  = View.GONE
        }


    }

    fun refresh(){
        fragmentPageAdapter.replaceFragment(1, ExtraThirdFragment())
        Log.v("Extra", "Extra1")
        fragmentPageAdapter.notifyDataSetChanged()
//        extra_second_vp.adapter = fragmentPageAdapter
        extra_second_vp.currentItem = 1
    }
}
