package com.figmatask.ui

import com.figmatask.R

data class VerticalCar(val halfCar : Int) {

    companion object {
        fun getDetails(): ArrayList<VerticalCar> {

            val carM = VerticalCar(
                R.drawable.halfcar

            )

            val carM1 = VerticalCar(
                R.drawable.halfcar
            )
            val carM2 = VerticalCar(
                R.drawable.halfcar
            )
            val carM3 = VerticalCar(
                R.drawable.halfcar
            )
            val carMakeList: ArrayList<VerticalCar> = ArrayList()
            carMakeList.add(carM)
            carMakeList.add(carM1)
            carMakeList.add(carM2)
            carMakeList.add(carM3)



            return carMakeList

        }
        }

        }
