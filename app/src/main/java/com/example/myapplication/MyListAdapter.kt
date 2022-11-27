package com.example.myapplication

import android.app.Activity
import android.database.DataSetObserver
import android.provider.MediaStore
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.TextView

class MyListAdapter(private val context: Activity, val users: Array<String>,val images:Array<Int>) : ArrayAdapter<String>(context,R.layout.row_item,users) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {

        val inflater = context.layoutInflater

        val rowView = inflater.inflate(R.layout.row_item, null,true)

        val titleText = rowView.findViewById(R.id.item_title) as TextView
        val imageView = rowView.findViewById(R.id.img) as ImageView

        titleText.text = users[position]
        imageView.setImageResource(images[position])

        return rowView
    }


}