package com.mada.recyclerviewdemo2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mada.recyclerviewdemo2.R

class MainActivity : AppCompatActivity() {

    companion object{
        const val LIST_VIEW = "list_view"
        const val GRID_VIEW = "grid_view"
    }

    private lateinit var toolbar: androidx.appcompat.widget.Toolbar
    var currentVisibleView = LIST_VIEW


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        listView()

    }

    private fun listView() {
        TODO("Not yet implemented")
    }
}