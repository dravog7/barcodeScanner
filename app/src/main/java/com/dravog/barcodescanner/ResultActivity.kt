package com.dravog.barcodescanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.marginBottom
import androidx.core.view.marginTop

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val dataList = intent.getStringArrayExtra("values")

        val layout = findViewById<LinearLayout>(R.id.dataList)
        dataList?.forEach {
            val textView = TextView(this)
            textView.text = it
            layout.addView(textView)
        }
    }
}