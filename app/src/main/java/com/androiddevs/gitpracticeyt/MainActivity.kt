package com.androiddevs.gitpracticeyt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("THIS IS CONTAINED IN MY SECOND COMMIT")
        println("LOCAL CHANGE")
        println("CHANGE 3")
        println("THIS LINE WILL BE MERGED")
    }
}