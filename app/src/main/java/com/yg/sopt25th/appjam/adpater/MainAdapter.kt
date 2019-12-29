package com.yg.sopt25th.appjam.adpater

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yg.first.R

/**
 * Created by 2yg on 2017. 12. 9..
 */
class MainAdapter(var mainList : ArrayList<String>) : RecyclerView.Adapter<MainViewHolder>() {
    private var onItemClick : View.OnClickListener? = null


    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.mainName.text = mainList[position]
        holder.mainName.setOnClickListener {

        }
        Log.v("Main", "c")

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val mainView : View = LayoutInflater.from(parent!!.context)
            .inflate(R.layout.main_item, parent, false)
        mainView.setOnClickListener(onItemClick)
        mainView.findViewById<TextView>(R.id.ml_name).setOnClickListener(onItemClick)
        mainView.findViewById<Button>(R.id.ml_button).setOnClickListener(onItemClick)

        Log.v("Main", "b")

//        mainView.findViewById<TextView>(R.id.ml_name).setOnClickListener(onItemClick)
        return MainViewHolder(mainView)
    }

    override fun getItemCount() = mainList.size

    fun setOnItemClickListener(l: View.OnClickListener){
        onItemClick = l
        Log.v("Main", "d")

    }
}
