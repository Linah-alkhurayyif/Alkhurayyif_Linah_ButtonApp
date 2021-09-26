package com.example.alkhurayyif_linah_buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var numbertextView:TextView
    lateinit var buttonminus:Button
    lateinit var buttonplus:Button
     var numbertext =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numbertextView =  findViewById(R.id.numbertextView)
        buttonminus =  findViewById(R.id.buttonminus)
        buttonplus =  findViewById(R.id.buttonplus)
        buttonminus.setOnClickListener{minus()}
        buttonplus.setOnClickListener{plus()}
    }
    fun plus(){
        numbertext ++
        numbertextView.text =numbertext.toString()
    }
    fun minus(){
        numbertext --
        numbertextView.text =numbertext.toString()
    }
}