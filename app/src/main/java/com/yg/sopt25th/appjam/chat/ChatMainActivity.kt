package com.yg.sopt25th.appjam.chat

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.*
import com.yg.first.R
import com.yg.sopt25th.appjam.adpater.MainAdapter
import com.yg.sopt25th.appjam.flood.myWatcher
import com.yg.sopt25th.appjam.flood.printAll
import com.yg.sopt25th.appjam.flood.toast
import kotlinx.android.synthetic.main.activity_chat_main.*

class ChatMainActivity : AppCompatActivity(), View.OnClickListener {


    private var dataBase : FirebaseDatabase = FirebaseDatabase.getInstance()
    private var dataBaseReference : DatabaseReference = dataBase.reference
    private var mainList : ArrayList<String> = ArrayList()
    private var newList : ArrayList<String> = ArrayList()
    lateinit var mainAdapter : MainAdapter
    var isAt = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_main)


        mainList.add("피카츄")
        mainList.add("라이츄")
        mainList.add("파이리")
        mainList.add("꼬부기")
        mainList.add("버터플")
        mainList.add("야도란")
        mainList.add("피죤투")
        mainList.add("또가스")



//        mainList.forEach { Log.v("All", it) }

        mainList.printAll()




//        mainList.makeRecyclerView(main_chat_list, )


        this.toast("간단하쥬?")

//        Toast.makeText(this, "언제까지 이럴래", Toast.LENGTH_SHORT)
//            .show()




        main_user_name.myWatcher()

        //이게 메인(입장 방)
//        main_next.setOnClickListener {
//            if((main_chat_name.text.toString() == "") or
//                (main_user_name.text.toString() == "")){
//                Toast.makeText(applicationContext, "정보를 입력하세요.", Toast.LENGTH_SHORT).show()
//            }else{
//                val intent = Intent(this, FireBaseActivity::class.java)
//                intent.putExtra("chatName", main_chat_name.text.toString())
//                intent.putExtra("userName", main_user_name.text.toString())
//                CommonData.myName = main_user_name.text.toString()
//                startActivity(intent)
//            }
//        }

//        if(main_chat_name.text.contains("@")){
//            Toast.makeText(this, "있음", Toast.LENGTH_SHORT).show()
//        }








        main_chat_list.visibility = View.GONE



        main_chat_name.addTextChangedListener(textWathcer)

        main_chat_list.setOnClickListener {

        }

        //setList()

    }

    private val textWathcer = object : TextWatcher{
        override fun afterTextChanged(s: Editable?) {
            if(!(s?:"").contains("@"))
                isAt = false
        }

        override fun beforeTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {
            if((s?:"").contains("@"))
                isAt = true
        }

        override fun onTextChanged(s: CharSequence?, start: Int,
                                   count: Int, after: Int) {
            if(isAt && (s?:"").isNotEmpty() && (s?:"").contains("@")){
//                Toast.makeText(this@ChatMainActivity, "ddd", Toast.LENGTH_SHORT)
//                    .show()
                newList =
                    mainList.filter { it.contains((s?:"").split("@")[1]) } as ArrayList
                mainAdapter = MainAdapter(newList)
                mainAdapter.setOnItemClickListener(this@ChatMainActivity)
                main_chat_list.adapter = mainAdapter
                main_chat_list.layoutManager = LinearLayoutManager(this@ChatMainActivity)
                main_chat_list.visibility = View.VISIBLE

            }else{
                main_chat_list.visibility = View.GONE
            }
        }

    }


    fun setList(){
        dataBaseReference.child("chat")
            .addChildEventListener(object : ChildEventListener {
            override fun onCancelled(p0: DatabaseError) {
            }

            override fun onChildMoved(p0: DataSnapshot, p1: String?) {
            }

            override fun onChildChanged(p0: DataSnapshot, p1: String?) {
            }

            override fun onChildAdded(p0: DataSnapshot, p1: String?) {
                mainList.add(p0.key!!)
                mainAdapter = MainAdapter(mainList)
                main_chat_list.adapter = mainAdapter

            }

            override fun onChildRemoved(p0: DataSnapshot) {
            }

        })
    }


    override fun onClick(v: View?) {
        Log.v("Main", v!!.toString())


        // [0, "209"], [0, "2091"], [1, "아몬드"], [2, "프레첼"], [0, "20912"]
        //완료
        // 착한 --> 원래 수정 전 배열, 수정 후 배열. 수정 전
        // 수정 전(array1) : [id1, 이미지1, "이름1"], [id2, 이미지2, "이름2"],
        // [id3, 이미지3, "이름3"], [id4, 이미지4, "이름4"]

        // 수정 후(완료를 눌렀을 때, array2) : [id1, 이미지, "이름11"],
        // [id3, 이미지3, "이름3"], [id4, 이미지4, "이름4"], [-1, "", "이름5"]
        // add update delete

        //0단계 --> 수정 전과 수정 후 중 더 긴 녀석 찾기
        //update 배열 구성 1단계 --> id와 이름 쌍 비교
        //2단계 --> 다른 걸 발견 --> update 배열에 추가



        when(v){

        }
        when(v){
            v.findViewById<TextView>(R.id.ml_name)->{
                val idx = main_chat_list.getChildAdapterPosition(v.parent as View)
                main_chat_name.setText(main_chat_name.text.split("@")[0] + mainList[idx])
                main_chat_name.setSelection(main_chat_name.text.length)
            }

            v.findViewById<Button>(R.id.ml_button) -> {
                val idx = main_chat_list.getChildAdapterPosition(v.parent as View)
                Toast.makeText(this, mainList[idx], Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

}
