package com.example.training_day4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.training_day4.adaptor.ItemAdaptor
import com.example.training_day4.data.Datasource
import com.google.android.material.tabs.TabLayout

class RecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        val textView: TextView = findViewById(R.id.textViewRA)
        textView.text = Datasource().loadAffirmation().size.toString()
        val TAG = RecyclerActivity::class.simpleName

        val myDataset = Datasource().loadAffirmation()
        val recyclerView: RecyclerView= findViewById(R.id.recyclerView)
        recyclerView.adapter = ItemAdaptor(this, myDataset)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        Log.i(TAG, "on recycler activity")
    }
}