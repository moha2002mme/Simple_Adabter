package com.example.mysimpleadabter


import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lv = findViewById<ListView>(R.id.lv)

        val products= listOf(
            mapOf("name" to "Dell", "prix" to "10000DH"),
            mapOf("name" to "Hp", "prix" to "6000DH"),
            mapOf("name" to "Microsoft", "prix" to "8500DH"),
            mapOf("name" to "Xiaomi", "prix" to "9000DH"),
            mapOf("name" to "Lenovo", "prix" to "9000"),
        )


        val adp=SimpleAdapter(this,products,android.R.layout.simple_list_item_2, arrayOf("name","prix"),
            intArrayOf(android.R.id.text1,android.R.id.text2))

        lv.adapter=adp


    }
}