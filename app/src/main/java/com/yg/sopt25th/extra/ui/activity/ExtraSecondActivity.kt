package com.yg.sopt25th.extra.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yg.first.R
import com.yg.sopt25th.extra.adapter.ExtraSecondAdapter
import com.yg.sopt25th.extra.data.ExtraSecondData
import com.yg.sopt25th.extra.ui.fragment.ExtraFirstFragment
import com.yg.sopt25th.extra.ui.fragment.ExtraFragmentAdapter
import com.yg.sopt25th.extra.ui.fragment.ExtraSecondFragment
import com.yg.sopt25th.extra.ui.fragment.ExtraThirdFragment
import kotlinx.android.synthetic.main.activity_extra_second.*

class ExtraSecondActivity : AppCompatActivity() {

    lateinit var extraSecondAdapter : ExtraSecondAdapter
    lateinit var extraSecondDatas : List<ExtraSecondData>
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



        val fragmentPageAdapter
                = ExtraFragmentAdapter(supportFragmentManager)

        fragmentPageAdapter.addFragments(ExtraFirstFragment())
        fragmentPageAdapter.addFragments(ExtraSecondFragment())
        fragmentPageAdapter.addFragments(ExtraThirdFragment())

        extra_second_vp.adapter = fragmentPageAdapter
    }
}
