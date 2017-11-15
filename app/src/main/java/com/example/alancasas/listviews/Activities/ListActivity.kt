package com.example.alancasas.listviews.Activities

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
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

        var adapter = Adapter()

    }
}
