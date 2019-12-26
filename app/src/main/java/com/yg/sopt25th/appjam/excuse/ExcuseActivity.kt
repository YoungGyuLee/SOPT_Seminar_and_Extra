package com.yg.sopt25th.appjam.excuse

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_excuse.*

class ExcuseActivity : AppCompatActivity() {
    lateinit var imgList : ArrayList<Int>
    lateinit var gridManager1 : GridLayoutManager
    lateinit var gridManager2 : GridLayoutManager
    lateinit var mCurrentLayoutManager : RecyclerView.LayoutManager
    lateinit var excuseAdapter : ExcuseAdpater
    var position = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.yg.first.R.layout.activity_excuse)

        imgList = ArrayList()
        imgList.add(com.yg.first.R.drawable.a1_st)
        imgList.add(com.yg.first.R.drawable.a2_nd)
        imgList.add(com.yg.first.R.drawable.a3_rd)
        imgList.add(com.yg.first.R.drawable.age)
        imgList.add(com.yg.first.R.drawable.advertisement)
        imgList.add(com.yg.first.R.drawable.btn_next)
        imgList.add(com.yg.first.R.drawable.btn_shop)
        imgList.add(com.yg.first.R.drawable.category)
        imgList.add(com.yg.first.R.drawable.brand)
        imgList.add(com.yg.first.R.drawable.a1_st)
        imgList.add(com.yg.first.R.drawable.btn_shop)
        imgList.add(com.yg.first.R.drawable.category)
        imgList.add(com.yg.first.R.drawable.advertisement)
        imgList.add(com.yg.first.R.drawable.a3_rd)
        imgList.add(com.yg.first.R.drawable.a2_nd)
        imgList.add(com.yg.first.R.drawable.common_full_open_on_phone)
        imgList.add(com.yg.first.R.drawable.category)
        imgList.add(com.yg.first.R.drawable.a3_rd)

        val mScaleGestureDetector = ScaleGestureDetector(this, object : ScaleGestureDetector.SimpleOnScaleGestureListener(){
            override fun onScale(detector: ScaleGestureDetector): Boolean {
                Log.v("Excuse", "여기는 줌2")

                if (detector.currentSpan > 200 && detector.timeDelta > 200) {
                    if (detector.currentSpan - detector.previousSpan < -1) {
                        if (mCurrentLayoutManager == gridManager1) {
                            mCurrentLayoutManager = gridManager2
                            excuse_list.layoutManager = mCurrentLayoutManager
                            excuse_list.scrollToPosition(position)
                            return true
                        }
                    } else if(detector.currentSpan - detector.previousSpan > 1) {
                        if (mCurrentLayoutManager == gridManager2) {
                            mCurrentLayoutManager = gridManager1
                            excuse_list.layoutManager = mCurrentLayoutManager
                            excuse_list.scrollToPosition(position)
                            return true
                        }
                    }
                }
                return false
            }
        })

        gridManager1 = GridLayoutManager(this, 1)
        gridManager2 = GridLayoutManager(this, 2)

        //initialize adapter
        excuseAdapter = ExcuseAdpater(imgList)

        //set layout manager
        mCurrentLayoutManager = gridManager2
        excuse_list.layoutManager = gridManager2


        excuse_list.adapter = excuseAdapter

//        excuse_list.setOnTouchListener(View.OnTouchListener { v, event ->
//            mScaleGestureDetector.onTouchEvent(event)
//
//
//            false
//        })

//        excuse_list.addOnScrollListener(object : RecyclerView.OnScrollListener(){
//            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
//                super.onScrollStateChanged(recyclerView, newState)
//            }
//
//            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
//                super.onScrolled(recyclerView, dx, dy)
//                Log.v("ExcuseY", dy.toString())
//            }
//
//        })

        excuse_list.addOnItemTouchListener(object : RecyclerView.OnItemTouchListener{
            override fun onTouchEvent(rv: RecyclerView, e: MotionEvent) {


            }

            override fun onInterceptTouchEvent(rv: RecyclerView, e: MotionEvent): Boolean {
                val child = rv.findChildViewUnder(e.x, e.y)
                position = rv.getChildAdapterPosition(child!!)
                mScaleGestureDetector.onTouchEvent(e)

                Log.v("ExcuseP", position.toString())

                return false
            }

            override fun onRequestDisallowInterceptTouchEvent(disallowIntercept: Boolean) {

            }

        })
    }
}
