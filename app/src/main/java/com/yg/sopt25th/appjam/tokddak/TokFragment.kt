package com.yg.sopt25th.appjam.tokddak


import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.yg.first.R
import kotlinx.android.synthetic.main.fragment_tok.*

/**
 * A simple [Fragment] subclass.
 */
class TokFragment : Fragment(), View.OnTouchListener, View.OnDragListener {
    val TAG = "Tok"
    lateinit var layoutTok : LinearLayout
    lateinit var tvTok : TextView

    override fun onTouch(view: View, motionEvent: MotionEvent): Boolean {
        return if (motionEvent.action == MotionEvent.ACTION_DOWN) {
            val dragShadowBuilder = View.DragShadowBuilder(view)
            view.startDrag(null, dragShadowBuilder, view, 0)
            true
        } else {
            false
        }
    }

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
                if((layoutTok.x <  dragEvent.x) && (dragEvent.x < layoutTok.x + layoutTok.width)
                    && (layoutTok.y < dragEvent.y) && (dragEvent.y < layoutTok.y + layoutTok.height)){
                    tvTok.text = btn_tok_fragment.text
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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tok, container, false)
    }

    override fun onStart() {
        super.onStart()
        layoutTok = activity!!.findViewById(R.id.layout_tok)
        tvTok = activity!!.findViewById(R.id.tv_tok)
        activity!!.findViewById<ConstraintLayout>(R.id.container_tok).setOnDragListener(this)
        btn_tok_fragment.setOnTouchListener(this)
    }




}
