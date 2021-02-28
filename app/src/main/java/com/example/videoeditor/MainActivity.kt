package com.example.videoeditor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.madhavanmalolan.ffmpegandroidlibrary.Controller

class MainActivity : AppCompatActivity() {
    val controller = Controller.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
}