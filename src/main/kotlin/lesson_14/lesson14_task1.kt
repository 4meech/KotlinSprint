package org.example.lesson_14

const val VESSEL_CAPACITY = 3547
const val VESSEL_SPEED = 23
const val VESSEL_DISPLACEMENT = 52310
const val FREIGHTER_SPEED = 14
const val FREIGHTER_DISPLACEMENT = 217612
const val ICEBREAKER_SPEED = 10
const val ICEBREAKER_CAPACITY = 80

fun main() {
    val titanic = Liner()
    val everGiven = Freighter()
    val krasin = Icebreaker()

    krasin.crushIce()
}

open class Liner(
    val vesselCapacity: Int = VESSEL_CAPACITY,
    val vesselSpeed: Int = VESSEL_SPEED,
    val vesselDisplacement: Int = VESSEL_DISPLACEMENT,
)

class Freighter (
    vesselCapacity: Int = VESSEL_CAPACITY,
    vesselSpeed: Int = FREIGHTER_SPEED,
    vesselDisplacement: Int = FREIGHTER_DISPLACEMENT,
) : Liner(vesselCapacity, vesselSpeed, vesselDisplacement)

class Icebreaker(
    vesselCapacity: Int = ICEBREAKER_CAPACITY,
    vesselSpeed: Int = ICEBREAKER_SPEED,
    vesselDisplacement: Int = VESSEL_DISPLACEMENT,
    val isIceCrushing: Boolean = true,
) : Liner(vesselCapacity, vesselSpeed, vesselDisplacement) {
    fun crushIce() {
        if (isIceCrushing) println("Хр-р-р-р-р-р!")
    }
}