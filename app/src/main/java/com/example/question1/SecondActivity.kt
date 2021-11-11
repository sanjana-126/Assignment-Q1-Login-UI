package com.example.question1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val user: String? = intent.getStringExtra("username")
        val pass: String? = intent.getStringExtra("pass")

        val mUSer:TextView = findViewById<TextView>(R.id.muser)
        mUSer.setText("name: "+user)

        val mPass:TextView = findViewById<TextView>(R.id.mpass)
        mPass.setText("pass: "+pass)
    }

}
