package com.example.alancasas.listviews.Activities

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.alancasas.listviews.R

class ListActivity : AppCompatActivity() {

    private var listView : ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        listView = findViewById(R.id.list_view)

        var names = arrayListOf<String>(
                "Alan",
                "Bibi",
                "Vega",
                "Mario",
                "Elsa"
        )

        names.add("Manuel")
        names.add("Jesus")
        names.add("Rodrigo")
        names.add("Felipe")
        names.add("Prdro")
        names.add("Samuel")
        names.add("Erika")
        names.add("Julian")
        names.add("Epistoles")
        names.add("Ignacio")
        names.add("Ruben")
        names.add("Lusi")
        names.add("Ej")




        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names)

        listView?.adapter = adapter

    }
}
