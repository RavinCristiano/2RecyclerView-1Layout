package com.figmatask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class HorizontalAdapter (private val carList : ArrayList<HorizontalCar>) :
    RecyclerView.Adapter<HorizontalAdapter.ModelViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HorizontalAdapter.ModelViewHolder {

        val v =  LayoutInflater.from(parent.context).inflate(R.layout.horizontal_cardview, parent, false)
        return ModelViewHolder(v)
    }

    override fun onBindViewHolder(holder: HorizontalAdapter.ModelViewHolder, position: Int) {

        holder.ItemImage.setImageResource(carList[position].carImage)
        holder.ItemText.setText(carList[position].carDesc)
        holder.carMfgDate.setText(carList[position].carDate)
    }

    override fun getItemCount(): Int {
        return carList.size
    }

    inner class ModelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var horizontalCard: CardView = itemView.findViewById(R.id.horizontal_card)
        var ItemImage: ImageView = itemView.findViewById(R.id.car_image)
        var ItemText: TextView = itemView.findViewById(R.id.textDescTv)
        var carMfgDate: TextView = itemView.findViewById(R.id.date)

    }
}

