package com.example.alancasas.listviews.Activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.GridView
import android.widget.Toast
import com.example.alancasas.listviews.MyAdapter
import com.example.alancasas.listviews.R

class GridActivity : AppCompatActivity() {
    private var gridView: GridView? = null

    private var counter:Int = 0

    var names : ArrayList<String>? = null
    var myAdapter : MyAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)


        gridView = findViewById(R.id.grid_view)

        names = arrayListOf<String> (
                "Alan",
                "Bibi",
                "Vega",
                "Mario",
                "Elsa"
        )
        names!!.add("Jesus")
        names!!.add("Rodrigo")
        names!!.add("Lusi")
        names!!.add("Ej")

        gridView?.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(this, "Clicked " + names!![position], Toast.LENGTH_LONG).show()
        }

        myAdapter = MyAdapter(this, R.layout.grid_item, names!!)

        gridView?.adapter = myAdapter

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var inflater = menuInflater
        inflater.inflate(R.menu.action_bar_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when(item?.itemId){
            R.id.add_item -> {
                this.names?.add("Agregado n ${++counter}" )

                this.myAdapter?.notifyDataSetChanged()

                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}



































