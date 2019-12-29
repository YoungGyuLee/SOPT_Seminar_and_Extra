package com.yg.sopt25th.appjam.flood

import android.app.Activity
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

fun EditText.myWatcher(){
    val textWathcer = object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
        }

        override fun beforeTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun onTextChanged(s: CharSequence?, start: Int,
                                   count: Int, after: Int) {
            if((s?:"").length > 5){
                Log.v("aaa", s.toString())
            }
        }
    }
    this.addTextChangedListener(textWathcer)
}


fun Activity.toast(text : String){
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}

fun <T>ArrayList<T>.printAll(){
    this.forEach { Log.v("All", it.toString()) }
}

fun <T>ArrayList<T>.makeRecyclerView(rv : RecyclerView,
                                     adapter : RecyclerView.Adapter<RecyclerView.ViewHolder>,
                                     lm : RecyclerView.LayoutManager){
    rv.layoutManager = lm
    rv.adapter = adapter
}












