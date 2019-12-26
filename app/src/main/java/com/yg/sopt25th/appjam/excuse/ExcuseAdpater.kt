package com.yg.sopt25th.appjam.excuse

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yg.first.R

class ExcuseAdpater(var list : ArrayList<Int>) : RecyclerView.Adapter<ExcuseViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExcuseViewHolder {
        val mainView : View = LayoutInflater.from(parent!!.context)
            .inflate(R.layout.excuse_item, parent, false)
        return ExcuseViewHolder(mainView)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ExcuseViewHolder, position: Int) {

        holder.excuseImage.setImageResource(list[position])

    }
}