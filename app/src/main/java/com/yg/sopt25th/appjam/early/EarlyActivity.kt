package com.yg.sopt25th.appjam.early

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.yg.first.R
import com.yg.sopt25th.appjam.early.adapter.EarlyAdapter
import kotlinx.android.synthetic.main.activity_early.*

class EarlyActivity : AppCompatActivity() {

    private lateinit var detailList : ArrayList<ArrayList<String>>
    private lateinit var clicked : ArrayList<Boolean>
    private lateinit var earlyAdapter: EarlyAdapter
    private lateinit var lineList : ArrayList<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_early)

        detailList = ArrayList()
        clicked = ArrayList()
        lineList = ArrayList()

        detailList.add(arrayListOf("상계역", "노원역", "창동역", "쌍문역"))
        detailList.add(arrayListOf("노원역", "중계역", "하계역", "공릉역"))
        detailList.add(arrayListOf("건대입구역", "구의역", "동서울역", "잠실나루"))

        clicked.add(false)
        clicked.add(false)
        clicked.add(false)

        lineList.add(R.color.colorAccent)
        lineList.add(R.color.colorPrimary)
        lineList.add(R.color.colorPrimaryDark)

        earlyAdapter = EarlyAdapter(this, detailList, clicked, lineList)
        early_list.adapter = earlyAdapter
        early_list.layoutManager = LinearLayoutManager(this)


    }


}
