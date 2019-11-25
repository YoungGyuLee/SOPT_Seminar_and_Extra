package com.yg.sopt25th.extra.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yg.first.R
import com.yg.sopt25th.extra.data.ExtraSecondData

class ExtraSecondAdapter(private val datas : List<ExtraSecondData>, val context : Context) : RecyclerView.Adapter<ExtraSecondViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExtraSecondViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.extra_itme, parent, false)
        return ExtraSecondViewHolder(view)
    }

    override fun getItemCount(): Int = datas.size

    override fun onBindViewHolder(holder: ExtraSecondViewHolder, position: Int) {
        holder.bind(datas[position], context)
    }
}