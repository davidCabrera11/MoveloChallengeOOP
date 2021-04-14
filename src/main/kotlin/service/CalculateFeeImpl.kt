package service

import model.ItemShip

class CalculateFeeImpl(private val itemShip: ItemShip, private val distance: Double):CalculateFee {

    override fun calculatePrice(): Double {

        return distance * (itemShip.weight/2) + itemShip.volume.calculateVolume()


    }



}