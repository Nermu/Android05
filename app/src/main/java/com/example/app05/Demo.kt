package com.example.app05

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_demo.*

class Demo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)

        button2.setOnClickListener {
            var i =  Intent("android.intent.action.MAIN")
            startActivity(i)
        }
    }
}
