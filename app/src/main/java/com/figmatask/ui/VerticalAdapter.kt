package com.figmatask.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.figmatask.R

class VerticalAdapter(private val carMakeList: ArrayList<VerticalCar>) :
        RecyclerView.Adapter<VerticalAdapter.ModelViewHolder>() {

        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): VerticalAdapter.ModelViewHolder {

            val v =  LayoutInflater.from(parent.context).inflate(R.layout.vertical_cardview, parent, false)
            return ModelViewHolder(v)
        }

        override fun onBindViewHolder(holder: VerticalAdapter.ModelViewHolder, position: Int) {

            holder.itemImageOne.setImageResource(carMakeList[position].halfCar)
        }

        override fun getItemCount(): Int {
            return carMakeList.size
        }

        inner class ModelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var verticalCardView: CardView = itemView.findViewById(R.id.verticalCard)
            var itemImageOne: ImageView = itemView.findViewById(R.id.vertical_car)

        }
    }
