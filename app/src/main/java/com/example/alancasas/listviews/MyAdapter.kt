package com.example.alancasas.listviews

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

public class MyAdapter(val context: Context, val layout: Int, val names: List<String>) : BaseAdapter(){

    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {

        var customView: View?

        //Copiamos vista
        customView = convertView

        //Creamos un inflador lista con el contexto
        val layoutInflater = LayoutInflater.from(context)

        //Iflamos la vista creada
        customView =  layoutInflater.inflate(R.layout.list_item, null)

        //Obtenemos del array el nombre que toque
        var currentName = names[position]

        //Obtenemos el textview del layout
        var textView  : TextView = customView.findViewById(R.id.text)

        //asignamos el nombre a la vista
        textView.text = currentName

        //Devolveos la vista
        return customView
    }

    override fun getItem(position: Int): Any = names[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getCount(): Int = names.size

}
