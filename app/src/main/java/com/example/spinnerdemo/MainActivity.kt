package com.example.spinnerdemo

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lunch = arrayListOf("雞腿飯", "魯肉飯", "排骨飯", "水餃", "陽春麵")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, lunch)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {

            override fun onItemSelected(parent: AdapterView<*>, view: View, pos: Int, id: Long) =
                Toast.makeText(this@MainActivity, "你選的是" + lunch[pos], Toast.LENGTH_SHORT).show()

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }
    }
}
