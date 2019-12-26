package com.yg.sopt25th.appjam.adpater

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yg.first.R

/**
 * Created by 2yg on 2017. 12. 9..
 */
class ChatViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    var userName : TextView = itemView!!.findViewById(R.id.cl_user_name) as TextView
    var userText : TextView = itemView!!.findViewById(R.id.cl_user_text) as TextView
    var myName : TextView = itemView!!.findViewById(R.id.cl_my_name) as TextView
    var myText : TextView = itemView!!.findViewById(R.id.cl_my_text) as TextView
}