package com.yg.sopt25th.second.seminar

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.yg.first.R

class SecondViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    private val tvItemRepo : TextView = itemView.findViewById(R.id.tv_second_item_repo)
    private val tvItemName : TextView = itemView.findViewById(R.id.tv_second_item_name)
    private val tvItemLang : TextView = itemView.findViewById(R.id.tv_second_item_lang)
    private val imgItemProf : ImageView = itemView.findViewById(R.id.img_second_item_prof)

    fun bind(data : SecondData, requestManager: RequestManager) {
        tvItemRepo.text = data.repo
        tvItemName.text = data.name
        tvItemLang.text = data.lang
    }
}
