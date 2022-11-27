package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Descrition_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.description)

        val id = intent.getStringExtra("id")
        val name_val = intent.getStringExtra("name")

        var phone_val: String? = null
        var desc: String? = null

        //getting the values from Strins
        if (id == "0") {
            desc = this.resources.getString(R.string.desc0)
            phone_val = this.resources.getString(R.string.phone0)
        } else {
            desc = this.resources.getString(R.string.desc1)
            phone_val = this.resources.getString(R.string.phone1)
        }


        val phone = findViewById<TextView>(R.id.phone) as TextView
        val name = findViewById<TextView>(R.id.name) as TextView
        val description = findViewById<TextView>(R.id.desc) as TextView



        phone.setText(phone_val)
        name.setText(name_val)
        description.setText(desc)


    }
}

