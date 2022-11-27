package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // finding the button
        val showButton = findViewById<Button>(R.id.showInput)

        // finding the edit text
        val editText = findViewById<EditText>(R.id.editText)

        //Move to other activity(Second_activity)
        val intent = Intent(this, Second_activity::class.java)

        //Button listener
        showButton.setOnClickListener {
            // Getting the user input
            val text = editText.text

            //Send text content to second_activity
            intent.putExtra("textContent",text.toString())

            // start your next activity
            startActivity(intent)
        }



    }
}