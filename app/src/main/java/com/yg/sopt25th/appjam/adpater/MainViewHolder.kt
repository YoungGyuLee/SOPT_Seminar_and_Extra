package com.yg.sopt25th.appjam.adpater

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yg.first.R

/**
 * Created by 2yg on 2017. 12. 9..
 */
class MainViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    var mainName : TextView = itemView!!.findViewById(R.id.ml_name) as TextView
    var mainBtn : Button = itemView!!.findViewById(R.id.ml_button) as Button
}