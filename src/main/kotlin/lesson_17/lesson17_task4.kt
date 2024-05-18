package org.example.lesson_17

fun main() {
    val parcel = Parcel("RA6172992384CN", "Внуково МАПП")

    parcel.currentLocation = "Столбище"
    println("Количество перемещений послыки с номером ${parcel.track}: ${parcel.moveCounter}")
}

class Parcel (trackingNumber: String, location: String) {
    var moveCounter = 0

    var currentLocation = location
        set(value) {
            field = value
            moveCounter++
        }

    val track = trackingNumber
}