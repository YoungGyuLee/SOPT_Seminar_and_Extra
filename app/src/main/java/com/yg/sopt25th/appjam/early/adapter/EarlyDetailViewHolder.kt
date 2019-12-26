package com.yg.sopt25th.appjam.early.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yg.first.R

class EarlyDetailViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    var imgTag = itemView.findViewById<ImageView>(R.id.img_detail_tag)
    var stopText = itemView.findViewById<TextView>(R.id.tv_detail_stop)

}