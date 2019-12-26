package com.yg.sopt25th.appjam.early.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yg.first.R

class EarlyAdapter(var context : Context, var earlyList : ArrayList<ArrayList<String>>,
                   var clicked : ArrayList<Boolean>, var lineList :  ArrayList<Int>) : RecyclerView.Adapter<EarlyViewHolder>(){

    private lateinit var earlyDetailAdapter: EarlyDetailAdapter

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EarlyViewHolder {
        val mainView : View = LayoutInflater.from(parent.context)
            .inflate(R.layout.early_item, parent, false)
        return EarlyViewHolder(mainView)
    }

    override fun getItemCount(): Int = earlyList.size

    override fun onBindViewHolder(holder: EarlyViewHolder, position: Int) {
        holder.lineView.setBackgroundResource(lineList[position])

        holder.moreText.setOnClickListener {
            if(clicked[position]){
                holder.detailList.visibility = View.GONE
                clicked[position] = false
            }else{
                earlyDetailAdapter = EarlyDetailAdapter(earlyList[position])
                holder.detailList.visibility = View.VISIBLE
                holder.detailList.adapter = earlyDetailAdapter
                holder.detailList.layoutManager = LinearLayoutManager(context)
                clicked[position] = true
            }
        }
    }
}
