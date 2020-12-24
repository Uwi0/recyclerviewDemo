package com.mada.recyclerviewdemo2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.mada.recyclerviewdemo2.R
import com.mada.recyclerviewdemo2.adapter.ItemAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        const val LIST_VIEW = "list_view"
        const val GRID_VIEW = "grid_view"
    }

    private lateinit var toolbar: androidx.appcompat.widget.Toolbar
    private lateinit var fabSwitch: FloatingActionButton
    private lateinit var rvList: RecyclerView
    private var currentVisibleView = LIST_VIEW


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvList = findViewById(R.id.rvItemsList)
        fabSwitch = findViewById(R.id.fabSwitch)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        listView()
        setFabSwitch()

    }

    private fun listView() {
        currentVisibleView = LIST_VIEW
        rvList.layoutManager = LinearLayoutManager(this)
        val itemAdapter = ItemAdapter(this, getList())
        rvList.adapter = itemAdapter
    }


    private fun gridView(){
        currentVisibleView = GRID_VIEW
        rvList.layoutManager = GridLayoutManager(this, 3)
        val itemAdapter = ItemAdapter(this, getList())
        rvList.adapter = itemAdapter

    }

    private fun setFabSwitch(){

        fabSwitch.setOnClickListener {
            if(currentVisibleView == LIST_VIEW){
                fabSwitch.setImageDrawable(
                        ContextCompat.getDrawable(
                                this@MainActivity,
                                R.drawable.ic_list
                        )
                )
                gridView()
            }else{
                fabSwitch.setImageDrawable(
                        ContextCompat.getDrawable(
                                this@MainActivity,
                                R.drawable.ic_grid
                        )
                )
                listView()
            }
        }
    }

    private fun getList(): ArrayList<String> {
        val list = ArrayList<String>()

        list.add("Item One")
        list.add("Item Two")
        list.add("Item Three")
        list.add("Item Four")
        list.add("Item Five")
        list.add("Item Six")
        list.add("Item Seven")
        list.add("Item Eight")
        list.add("Item Nine")
        list.add("Item Ten")
        list.add("Item Eleven")
        list.add("Item Twelve")

        return list
    }
}