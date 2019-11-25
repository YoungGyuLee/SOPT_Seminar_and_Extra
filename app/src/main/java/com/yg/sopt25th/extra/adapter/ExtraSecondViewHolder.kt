package com.yg.sopt25th.extra.adapter

import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.yg.first.R
import com.yg.sopt25th.extra.data.ExtraSecondData

class ExtraSecondViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    private val secondBtnTag : Button = itemView.findViewById(R.id.extra_item_btn_tag2)
    private val secondTvTag : TextView = itemView.findViewById(R.id.extra_item_tv_tag)
    private val secondLayout : ConstraintLayout  = itemView.findViewById(R.id.extra_item_container)

    fun bind(data : ExtraSecondData, context : Context) {
        secondBtnTag.text = data.btnTag
        secondTvTag.text = data.tvTag

        secondBtnTag.setOnClickListener {
            Toast.makeText(context, data.btnTag, Toast.LENGTH_SHORT).show()
        }
    }
}
