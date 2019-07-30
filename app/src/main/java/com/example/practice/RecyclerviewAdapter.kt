package com.example.practice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MeasureUnitAdapter(
    private val context: Context, private val measureUnitList: ArrayList<MeasureUnit>) :
    RecyclerView.Adapter<MeasureUnitAdapter.Holder>() {
    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val unitBold = itemView.findViewById<TextView>(R.id.measureUnit_bold)
        private val unitNormal = itemView.findViewById<TextView>(R.id.measureUnit_normal)

        fun bind(measureUnit: MeasureUnit) {
            unitBold?.text = measureUnit.measureUnitBold
            unitNormal?.text = measureUnit.measureUnitnormal
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.activity_recycleview_items, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(measureUnitList[position])
    }

    override fun getItemCount(): Int {
        return measureUnitList.size
    }



}