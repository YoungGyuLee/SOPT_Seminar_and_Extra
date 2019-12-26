package com.yg.sopt25th.appjam.early.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yg.first.R

class EarlyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    var lineView = itemView.findViewById(R.id.early_item_line) as ImageView
    var moreText = itemView.findViewById<TextView>(R.id.early_item_tv)
    var detailList = itemView.findViewById<RecyclerView>(R.id.early_detail_list)


}