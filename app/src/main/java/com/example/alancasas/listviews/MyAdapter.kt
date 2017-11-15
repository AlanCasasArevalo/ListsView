package com.example.alancasas.listviews

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MyAdapter(val context: Context, val layout: Int, val names: List<String>) : BaseAdapter(){

    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View? {

        var viewHolder : ViewHolder
        var customView : View?

        if (convertView == null){

            var layoutInflater = LayoutInflater.from(context)
            customView = layoutInflater.inflate(this.layout, null)
            viewHolder = ViewHolder()
            viewHolder.nameTextView = customView.findViewById(R.id.custom_text)
            customView.tag = viewHolder

        }else {
            customView = convertView
            viewHolder = customView.tag as ViewHolder
        }

        //Obtenemos del array el nombre que toque
        var currentName = names[position]


        viewHolder.nameTextView.text = currentName

        return customView
    }

    override fun getItem(position: Int): Any = names[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getCount(): Int = names.size

    class ViewHolder  {
        lateinit var nameTextView: TextView
    }

}
















