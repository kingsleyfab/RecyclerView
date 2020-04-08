package com.example.recyclerview

import android.os.Build.VERSION_CODES.O
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.my_item.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myItemList = generateDummyList(10)
        recyclerView.adapter = MyItemAdapter(myItemList)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun generateDummyList(size: Int): List<MyItem> {

        val list = ArrayList<MyItem>()

        for (i in 0 until size){
     val  drawable = when(i %  3) {

     0 -> R. drawable. open
         1 -> R. drawable.me
         else -> R.drawable.phone
     }
          val item = MyItem( drawable, text1 =  "Item $i", text2 ="Line 2" )
            list += item
        }
 return list

    }



}