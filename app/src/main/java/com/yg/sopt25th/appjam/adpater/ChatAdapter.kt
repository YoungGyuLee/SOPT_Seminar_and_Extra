package com.yg.sopt25th.appjam.adpater

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yg.first.R


/**
 * Created by 2yg on 2017. 12. 9..
 */
class ChatAdapter(var chatDatas : ArrayList<ChatData>) : RecyclerView.Adapter<ChatViewHolder>() {
    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        if(chatDatas[position].userName.equals(CommonData.myName)) {
            holder!!.myName.text = chatDatas[position].userName
            holder!!.myText.text = chatDatas[position].message
        }else {
            holder!!.userName.text = chatDatas[position].userName
            holder!!.userText.text = chatDatas[position].message
        }    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val mainView : View = LayoutInflater.from(parent!!.context)
            .inflate(R.layout.chat_item, parent, false)
        return ChatViewHolder(mainView)
    }

    override fun getItemCount(): Int = chatDatas.size
}