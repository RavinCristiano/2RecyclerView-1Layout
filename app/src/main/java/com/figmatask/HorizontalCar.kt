package com.figmatask

data class HorizontalCar(val carImage : Int, val carDesc : String, val carDate : String) {
    companion object {
        fun getModel(): ArrayList<HorizontalCar> {

            val carModel1 = HorizontalCar(
                R.drawable.carrectangle,
                "Step Into Tomorrow: Exploring Spatial Computing’s Impact On Industries And The Metaverse!",
                "11/09/2024"
            )

            val carModel2 = HorizontalCar(
                R.drawable.carrectangle,
                "Step Into Tomorrow: Exploring Spatial Computing’s Impact On Industries And The Metaverse!",
                "11/09/2024"
            )
            val carModel3 = HorizontalCar(
                R.drawable.carrectangle,
                "Step Into Tomorrow: Exploring Spatial Computing’s Impact On Industries And The Metaverse!",
                "11/09/2024"
            )
            val carModel4 = HorizontalCar(
                R.drawable.carrectangle,
                "Step Into Tomorrow: Exploring Spatial Computing’s Impact On Industries And The Metaverse!",
                "11/09/2024"
            )
            val carList: ArrayList<HorizontalCar> = ArrayList()
            carList.add(carModel1)
            carList.add(carModel2)
            carList.add(carModel3)
            carList.add(carModel4)

            return carList
        }
        }
    }
