package com.example.training_day4

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class HomeAct: AppCompatActivity(), AdapterView.OnItemClickListener {
    lateinit var etHome: EditText
    lateinit var button: Button
    lateinit var textView: TextView

    var TAG = HomeAct::class.simpleName

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        etHome = findViewById<EditText>(R.id.etHome)

//        var name = intent.getStringExtra("key")
//        var hTextView = findViewById<TextView>(R.id.textView2).apply {
//            text = name
//        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu_home,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        when(item.itemId){
            R.id.fMenuItem -> { Toast.makeText(this,"first item selected",Toast.LENGTH_SHORT).show()}
            R.id.sMenuItem -> { Toast.makeText(this,"second item selected",Toast.LENGTH_SHORT).show()}

        }
        return true
    }

    fun sendResult(view: View){
        var result = etHome.text.toString()
        var resIntent = Intent()
        resIntent.putExtra("resultkey", result)
        setResult(RESULT_OK, resIntent)
        finish()
    }
}