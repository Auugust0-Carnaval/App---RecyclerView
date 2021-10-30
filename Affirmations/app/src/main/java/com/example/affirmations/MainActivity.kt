package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import com.example.affirmations.MainActivity
import android.os.Bundle
import android.widget.TextView
import com.example.affirmations.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val textView : TextView = findViewById(R.id.textview)
        //textView.text = DataSource().loadAffirmations().size.toString() //heh foi kaka mas é text, sim amsi


    }
}