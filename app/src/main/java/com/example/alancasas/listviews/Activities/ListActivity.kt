package com.example.alancasas.listviews.Activities

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.alancasas.listviews.MyAdapter
import com.example.alancasas.listviews.R

class ListActivity : AppCompatActivity() {

    private var listView : ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        listView = findViewById(R.id.list_view)

        var names = arrayListOf<String> (
                "Alan",
                "Bibi",
                "Vega",
                "Mario",
                "Elsa"
        )

        names.add("Manuel")
        names.add("Jesus")
        names.add("Rodrigo")
        names.add("Lusi")
        names.add("Ej")

        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names)

        listView?.adapter = adapter

        listView?.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(this, "Clicked " + names.get(position), Toast.LENGTH_LONG).show()
        }

        var myAdapter : MyAdapter = MyAdapter(this, R.layout.list_item, names)

        listView?.adapter = myAdapter

    }

}











































