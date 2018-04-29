package com.example.dilip.listviewexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    var listItem = listOf("Delhi","Pune","Kolkata","Bihar","Patana","Motihari");

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = findViewById(R.id.list) as ListView
        var adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,listItem);
        list.adapter = adapter;
    }
}
