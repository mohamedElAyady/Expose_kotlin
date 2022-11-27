package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Second_activity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        // finding the TextView
        val txtView = findViewById<TextView>(R.id.txt_view) as TextView

        //get the text Content from using intent
        val cnt = intent.getStringExtra("textContent")

        //Set the value into the textView
        txtView.setText(cnt)

        // use arrayadapter and define an array
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
        "Virat Kohli", "Rohit Sharma", "Steve Smith",
        "Kane Williamson", "Ross Taylor")

        val imageId =arrayOf<Int>(
            R.drawable.pers1,
            R.drawable.index,
            R.drawable.pers2,
            R.drawable.pers3,
            R.drawable.pers4,
        )

        // access the listView from xml file
        var mListView = findViewById<ListView>(R.id.userlist)

        //put the array of users and images in the Adapter
        val myListAdapter = MyListAdapter(this,users,imageId)

        //link the ArrayAdapter with the listView
        mListView.adapter = myListAdapter


        //add a click listener to the items
        mListView.setOnItemClickListener() {
                adapterView, view, position, id ->

            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)


            //Move to other activity(Description_activity)
            val intent = Intent(this, Descrition_activity::class.java)

            intent.putExtra("id",itemIdAtPos.toString())
            intent.putExtra("name",itemAtPos.toString())

            startActivity(intent)
        }

        }




}