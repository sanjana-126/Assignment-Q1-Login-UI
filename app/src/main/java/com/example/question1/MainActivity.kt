package com.example.question1

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatRadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mButton:Button = findViewById<Button>(R.id.mdone)
        var mUsename:EditText = findViewById<EditText>(R.id.mEditTextUserid)
        var mPassword:EditText = findViewById<EditText>(R.id.mEditTextPass)
        mButton.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            val name = mUsename.text.toString()
            val pass = mPassword.text.toString()
            if(name == "" || pass == "")
                Toast.makeText(this@MainActivity,"Please enter valid details",Toast.LENGTH_SHORT).show()
            else {
                intent.putExtra("username", name)
                intent.putExtra("pass", pass)
                startActivity(intent)
            }
        }
    }

    fun onRadioButtonChecked(view: android.view.View) {
        var rbleft:AppCompatRadioButton = findViewById<AppCompatRadioButton>(R.id.rbleft)
        var rbright:AppCompatRadioButton = findViewById<AppCompatRadioButton>(R.id.rbright)
        var isSelected:Boolean = view.isSelected()

        when (view.id) {
            R.id.rbleft ->
                if(!isSelected) {
                    rbleft.setTextColor(Color.WHITE)
                    rbright.setTextColor(Color.BLACK)
                }
            R.id.rbright ->
                if(!isSelected) {
                    rbright.setTextColor(Color.WHITE)
                    rbleft.setTextColor(Color.BLACK)
                }
        }
    }

    fun onImageClick(view: android.view.View) {
        when(view.id){
            R.id.mtwitter ->
                Toast.makeText(this@MainActivity, "Clicked on Twitter", Toast.LENGTH_SHORT).show()
            R.id.mfacebook ->
                Toast.makeText(this@MainActivity, "Clicked on Facebook", Toast.LENGTH_SHORT).show()
            R.id.mgoogle ->
                Toast.makeText(this@MainActivity, "Clicked on Google", Toast.LENGTH_SHORT).show()
        }
    }
}
