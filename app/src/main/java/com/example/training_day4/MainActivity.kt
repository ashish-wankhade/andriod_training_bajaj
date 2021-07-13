package com.example.training_day4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var TAG = MainActivity::class.simpleName
    lateinit var nameEditText: EditText
    lateinit var textView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nameEditText = findViewById(R.id.editTextTextPersonName)
        textView = findViewById(R.id.textView)
        Log.i(TAG, "onCreate")
    }

    fun clickHandler(view: View){
        when(view.id){
            R.id.buttonL -> { startHomeResult() }
            R.id.buttonC -> { dialActivity() }
        }
        Log.v(TAG, "clickHandler")
//        createAlarm("wake up",3,18)
//        textView.text = nameEditText.text
//        var homeIntent: Intent;
//        homeIntent = Intent(this, Calender_Act::class.java)
//        startActivityForResult(homeIntent, 123)
//        Toast.makeText(this, nameEditText.text, Toast.LENGTH_SHORT).show()
//        var homeIntent: Intent;
//        homeIntent = Intent(this, Calender_Act::class.java).apply {
//            putExtra("key", nameEditText.text)
//        }
//        startActivity(homeIntent)
        }

    private fun startHomeResult(){
        var homeIntent: Intent;
        homeIntent = Intent(this, HomeAct::class.java)
        startActivityForResult(homeIntent, 123)
    }

    fun dialActivity(){
        val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:7058087633"))
        startActivity(intent)
    }

    fun createAlarm(message: String, hour: Int, minutes: Int) {
        val intent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, message)
            putExtra(AlarmClock.EXTRA_HOUR, hour)
            putExtra(AlarmClock.EXTRA_MINUTES, minutes)
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 123 && resultCode == RESULT_OK) {
            var result = data?.getStringExtra("resultkey")
            Toast.makeText(this,result,Toast.LENGTH_SHORT).show()
        }
    }
}