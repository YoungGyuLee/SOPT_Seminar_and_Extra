package com.yg.sopt25th.appjam.tokddak

import android.os.Bundle
import android.util.Log
import android.view.DragEvent
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.yg.first.R
import kotlinx.android.synthetic.main.activity_tok.*

class TokActivity : AppCompatActivity(), View.OnTouchListener, View.OnDragListener {
    override fun onTouch(view: View, motionEvent: MotionEvent): Boolean {
        Log.v(TAG, "onTouch: view->view$view\n MotionEvent$motionEvent")
        return if (motionEvent.action == MotionEvent.ACTION_DOWN) {
            val dragShadowBuilder = View.DragShadowBuilder(view)
            view.startDrag(null, dragShadowBuilder, view, 0)
            true
        } else {
            false
        }
    }

    val TAG = "Tok"


    override fun onDrag(view: View, dragEvent: DragEvent): Boolean {
        when(dragEvent.action){
                DragEvent.ACTION_DRAG_ENDED -> {
                    Log.d(TAG, "onDrag: ACTION_DRAG_ENDED ")
                    return true
                }
                DragEvent.ACTION_DRAG_EXITED -> {
                    Log.v(TAG, "onDrag: ACTION_DRAG_EXITED")
                    return true
                }
                DragEvent.ACTION_DRAG_ENTERED -> {
                    Log.v(TAG, "onDrag: ACTION_DRAG_ENTERED")
                    return true
                }
                DragEvent.ACTION_DRAG_STARTED -> {
                    Log.v(TAG, "onDrag: ACTION_DRAG_STARTED")
                    return true
                }
                DragEvent.ACTION_DROP -> {
                    Log.v(TAG, "onDrag: ACTION_DROP")
//                    val tvState = dragEvent.localState as View
                    Log.v(TAG, "onDrag:viewX" + dragEvent.x + "viewY" + dragEvent.y)
                    if((layout_tok.x <  dragEvent.x) && (dragEvent.x < layout_tok.x + layout_tok.width)
                        && (layout_tok.y < dragEvent.y) && (dragEvent.y < layout_tok.y + layout_tok.height)){
                        tv_tok.text = btn_tok.text
                    }
//                    Log.v(TAG, "onDrag: Owner->" + tvState.parent)
//                    val tvParent = tvState.parent as ViewGroup
//                    tvParent.removeView(tvState)
//                    val container = view as ConstraintLayout
//                    container.addView(tvState)
//                    tvParent.removeView(tvState)
//                    tvState.x = dragEvent.x
//                    tvState.y = dragEvent.y
//                    view.addView(tvState)
//                    view.setVisibility(View.VISIBLE)
                    return true
                }
                DragEvent.ACTION_DRAG_LOCATION -> {
                    Log.v(TAG, "onDrag: ACTION_DRAG_LOCATION")
                    return true
                }
                else -> return false
        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tok)

        val tokFragment = TokFragment()
        addFragment(tokFragment)
//        container_tok.setOnDragListener(this)
//        btn_tok.setOnTouchListener(this)
//        val btnFragment = tokFragment.view!!.findViewById<Button>(R.id.btn_tok_fragment)
//        btnFragment.setOnTouchListener(this)

    }

    fun addFragment(fragment : Fragment){
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        transaction.add(R.id.container_tok_fragment, fragment)
        transaction.commit()
    }
}
