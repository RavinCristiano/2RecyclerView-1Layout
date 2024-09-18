package com.figmatask

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.figmatask.ui.VerticalAdapter
import com.figmatask.ui.VerticalCar

class MainActivity : ComponentActivity() {

    private lateinit var verticalRecyclerView: RecyclerView
    private lateinit var horizontalRecyclerView: RecyclerView
    private lateinit var horizontalAdapter: HorizontalAdapter
    private lateinit var verticalAdapter: VerticalAdapter
    private lateinit var relativeLayout: RelativeLayout

    lateinit var logoImg : ImageView
    lateinit var searchImg: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main); // Your login layout

        logoImg = findViewById<ImageView>(R.id.logoImage)
        searchImg = findViewById<ImageView>(R.id.searchBar)
        var recentTv = findViewById<TextView>(R.id.recent_tv)
        //var linearLayout = findViewById<LinearLayout>(R.id.linearLayout)
        relativeLayout = findViewById<RelativeLayout>(R.id.relativeLayout)
         verticalRecyclerView = findViewById<RecyclerView>(R.id.vertical_recycler_view)
         horizontalRecyclerView = findViewById<RecyclerView>(R.id.horizontal_recycler_view)

        if (verticalRecyclerView != null && horizontalRecyclerView != null)
        {

        setupVerticalRecyclerView()
        setupHorizontalRecyclerView()
    }else{
        Log.e("MainActivity", "RecyclerViews not initialized")
        }
        }

    private fun setupHorizontalRecyclerView() {
        horizontalRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        horizontalAdapter = HorizontalAdapter(HorizontalCar.getModel())
        horizontalRecyclerView.adapter = horizontalAdapter
    }

    private fun setupVerticalRecyclerView() {
        verticalRecyclerView.layoutManager = LinearLayoutManager(this)
        verticalAdapter = VerticalAdapter(VerticalCar.getDetails())
        verticalRecyclerView.adapter = verticalAdapter
    }
}

