package com.example.sunsh.counts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //データを準備
        var items = ArrayList<String>()
        var i = 0
        while (i < 30) {
            items.add("item-$i")
            i++
        }

        val adapter = ArrayAdapter<String>(
                this,
                R.layout.list_item,
                items
        )

        myListView.adapter = adapter

    }
}
