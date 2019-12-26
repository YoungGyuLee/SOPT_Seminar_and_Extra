package com.yg.sopt25th.appjam.excuse

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.yg.first.R

class ExcuseViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    var excuseImage : ImageView = itemView.findViewById(R.id.excuse_item_img)
}