package com.yg.sopt25th.second.seminar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.yg.first.R

class SecondAdapter(val data : List<SecondData>, val requestManager: RequestManager) : RecyclerView.Adapter<SecondViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_repository, parent, false)
        return SecondViewHolder(view)
    }

    override fun getItemCount()
            : Int = 0
    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.bind(data[position], requestManager)
    }
}
