import model.ItemShip
import model.Volume
import service.CalculateFeeImpl


fun main(args: Array<String>) {

    //Movelo Challenge
    val itemShip = ItemShip(20.1, Volume(20.2,15.0,10.5))
    val calculateFeeImpl = CalculateFeeImpl(itemShip,30.0)

    println("Price for shipping item is: ${calculateFeeImpl.calculatePrice()} USD")


}