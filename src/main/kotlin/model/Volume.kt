package model

data class Volume(private val height: Double,private val width: Double,private val length: Double) {

    fun calculateVolume():Double{
        return height * width * length

    }
}