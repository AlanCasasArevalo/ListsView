package com.example.alancasas.listviews.Activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.GridView
import android.widget.Toast
import com.example.alancasas.listviews.MyAdapter
import com.example.alancasas.listviews.R

class GridActivity : AppCompatActivity() {
        private var gridView: GridView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)


        gridView = findViewById(R.id.grid_view)

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

        gridView?.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(this, "Clicked " + names[position], Toast.LENGTH_LONG).show()
        }

        var myAdapter : MyAdapter = MyAdapter(this, R.layout.grid_item, names)

        gridView?.adapter = myAdapter

    }


}

