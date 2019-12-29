package com.yg.sopt25th.appjam.chat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.*
import com.yg.first.R
import com.yg.sopt25th.appjam.adpater.ChatAdapter
import com.yg.sopt25th.appjam.adpater.ChatData
import kotlinx.android.synthetic.main.activity_fire_base.*

class FireBaseActivity : AppCompatActivity() {

    private var dataBase : FirebaseDatabase = FirebaseDatabase.getInstance()
    private var dataBaseReference : DatabaseReference = dataBase.reference
    private var chatList : ArrayList<ChatData> = ArrayList<ChatData>()
    private lateinit var chatAdapter : ChatAdapter

    var userName = ""
    var chatName = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fire_base)
        //이게 ㄹㅇ 채팅 방

        userName = intent.getStringExtra("userName")
        chatName = intent.getStringExtra("chatName")


        chat_view.layoutManager = LinearLayoutManager(this)

        openChat()


        chat_sent.setOnClickListener {
            if(chat_edit.text.toString() == ""){

            }else{
                val chat = ChatData(userName, chat_edit.text.toString())
                dataBaseReference.child("chat").child(chatName).push().setValue(chat)
                chat_edit.setText("")
            }
        }

    }

    fun addMessage(dataSnapshot: DataSnapshot){
        val chatData = dataSnapshot.getValue<ChatData>(ChatData::class.java)

        chatList.add(ChatData(chatData!!.userName, chatData.message))
        chatAdapter = ChatAdapter(chatList)
        chat_view.adapter = chatAdapter

    }


    fun openChat(){
        dataBaseReference.child("chat")
            .child(chatName)
            .addChildEventListener(
            object : ChildEventListener {
                override fun onCancelled(p0: DatabaseError) {
                }

                override fun onChildMoved(p0: DataSnapshot, p1: String?) {
                }

                override fun onChildChanged(p0: DataSnapshot, p1: String?) {
                }

                override fun onChildAdded(p0: DataSnapshot, p1: String?) {
                    addMessage(p0!!)
                }

                override fun onChildRemoved(p0: DataSnapshot) {
                }

            }
        )
    }

}
