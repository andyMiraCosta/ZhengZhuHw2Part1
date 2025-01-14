package com.example.homework2zhengzhu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button: Button = findViewById<Button>(R.id.btnClickMe)
        button.setOnClickListener({
            val intent = Intent(this, ResultsActivity::class.java)
            startActivity(intent)
        })
    }

    //override fun onClick(v: View?) {
    //    val intent = Intent(this, ResultsActivity::class.java)
    //    startActivity(intent)
    //}
}
