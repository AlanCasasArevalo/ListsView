package com.example.alancasas.listviews.Activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
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

        registerForContextMenu(gridView)

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

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        var inflater = menuInflater

        var adapterInfo: AdapterView.AdapterContextMenuInfo = menuInfo as AdapterView.AdapterContextMenuInfo

        menu?.setHeaderTitle(this.names?.get(adapterInfo.position))

        inflater.inflate(R.menu.context_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem?): Boolean {

        var adapterInfo: AdapterView.AdapterContextMenuInfo = item?.menuInfo as AdapterView.AdapterContextMenuInfo

        when(item?.itemId){
            R.id.delete_item -> {
                this.names?.removeAt(adapterInfo.position)
                this.myAdapter?.notifyDataSetChanged()
                return true
            }
        }

        return super.onContextItemSelected(item)

    }

}



































