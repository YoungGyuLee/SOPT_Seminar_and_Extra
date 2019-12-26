package com.yg.sopt25th.appjam.early.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yg.first.R

class EarlyDetailAdapter(var detailList : ArrayList<String>) : RecyclerView.Adapter<EarlyDetailViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EarlyDetailViewHolder {
        val mainView : View = LayoutInflater.from(parent.context)
            .inflate(R.layout.early_detail_item, parent, false)
        return EarlyDetailViewHolder(mainView)
    }

    override fun getItemCount(): Int = detailList.size

    override fun onBindViewHolder(holder: EarlyDetailViewHolder, position: Int) {
        holder.imgTag.setImageResource(R.drawable.a3_rd)
        holder.stopText.text = detailList[position]
    }
}