package com.yg.sopt25th.appjam

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.yg.first.R
import com.yg.sopt25th.appjam.tokddak.TokActivity
import kotlinx.android.synthetic.main.activity_app_jam.*

class AppJamActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_jam)



        startActivity(Intent(this, TokActivity::class.java))

//        temp_view1.setOnClickListener {
//            temp_view1.getToast()
//        }
//        startActivity(Intent(this, ExcuseActivity::class.java))

//        val intent = Intent(this, ExtraSecondActivity::class.java)
//        intent.putExtra("id", "ygyg0909")
//        setResult(1200, intent)

    }


    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        //전체 60분
        val time1Length = temp_view1.width / 10
        //지하철 6분
        val time2Length = temp_view1.width / 5
        //버스 12분

        //중앙만 늘릴 수 있는 방법을 찾음으로써 편안함을 영위해보자.







        Log.v("Length", temp_view1.width.toString())
        Log.v("Length", time2Length.toString())

        val params1 = time1.layoutParams as ConstraintLayout.LayoutParams
        params1.width = time1Length
        params1.horizontalBias = 0.2f
        time1.layoutParams = params1

        val params2 = time2.layoutParams as ConstraintLayout.LayoutParams
        params2.width = time2Length
        params2.horizontalBias = 0.7f
        time2.layoutParams = params2
    }

    fun View.getToast(){
        Toast.makeText(this@AppJamActivity, "dddd", Toast.LENGTH_SHORT)
            .show()
    }
}
