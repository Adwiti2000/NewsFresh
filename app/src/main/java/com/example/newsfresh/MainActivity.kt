package com.example.newsfresh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsfresh.databinding.ActivityMainBinding


private lateinit var mainBinding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        var RecyclerView= mainBinding.recyclerView
        RecyclerView.layoutManager=LinearLayoutManager(this)
        val items=fetchData()
        val adapter:NewsListAdapter= NewsListAdapter(items)
        RecyclerView.adapter=adapter
    }
    private fun fetchData():ArrayList<String>{
        val list=ArrayList<String>()
        for(i in 0 until 1000){
            list.add("Items $i")
        }
    return list
    }
}