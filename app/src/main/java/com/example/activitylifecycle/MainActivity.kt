package com.example.activitylifecycle

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("TAG", "onCreate called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        Log.d("TAG", "onStart called")
        super.onStart()
    }

    override fun onResume() {
        Log.d("TAG", "onResume called")
        super.onResume()
    }

    override fun onRestart() {

        Log.d("TAG", "onRestart called")
        super.onRestart()
    }

    override fun onPause() {
        Log.d("TAG", "onPause called")
        super.onPause()
    }
    override fun onStop() {
        Log.d("TAG", "onStop called")
        super.onStop()
    }
    override fun onDestroy() {
        Log.d("TAG", "onDestroy called")
        super.onDestroy()
    }
}