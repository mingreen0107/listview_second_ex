package com.example.listview_second_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            //val list_item = mutableListOf<String>()

            //list_item.add("A")
            //list_item.add("B")
            //list_item.add("C")

        val list_item2 = mutableListOf<ListviewModel>()
        list_item2.add(ListviewModel("a", "b"))
        list_item2.add(ListviewModel("c", "d"))
        list_item2.add(ListviewModel("e", "f"))

        val listview = findViewById<ListView>(R.id.mainlistview)

        val listviewAdapter = ListViewAdapter(list_item2)
        listview.adapter = listviewAdapter

        listview.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this, list_item2[position].text1, Toast.LENGTH_LONG).show()

        }

    }

}