package com.example.training_day4.adaptor

import android.content.Context
import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.training_day4.R
import com.example.training_day4.model.Affirmation

class ItemAdaptor(private val context: Context, private val dataset: List<Affirmation>):
    RecyclerView.Adapter<ItemAdaptor.ItemViewHolder>(){

    val TAG = ItemAdaptor::class.simpleName

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val vhtextView: TextView = view.findViewById(R.id.textViewListItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
//        TODO("Not yet implemented")
        val rowLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(rowLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
//        TODO("Not yet implemented")
        val item = dataset[position]
        holder.vhtextView.text = context.resources.getString(item.stringResourceId)
    }

    override fun getItemCount(): Int {
        return dataset.size
//        TODO("Not yet implemented")
    }
}