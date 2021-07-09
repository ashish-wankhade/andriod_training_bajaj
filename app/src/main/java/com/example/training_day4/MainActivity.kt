package com.example.training_day4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    lateinit var nameEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nameEditText = findViewById(R.id.editTextTextPersonName)
    }

    fun clickHandler(view: View){
        Toast.makeText(this, nameEditText.text, Toast.LENGTH_SHORT).show()
    }
}