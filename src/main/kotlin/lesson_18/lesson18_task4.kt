package org.example.lesson_18

import kotlin.math.pow

const val EDGE_LENGTH = 6.0
const val PARCEL_LENGTH = 7.0
const val PARCEL_WIDTH = 6.5
const val PARCEL_HEIGTH = 5.0

fun main() {
    val cubicalParcel = CubicalParcel(EDGE_LENGTH)
    val rectangularParcel = RectangularParcel(PARCEL_LENGTH, PARCEL_WIDTH, PARCEL_HEIGTH)

    println(cubicalParcel.calculateArea())
    println(rectangularParcel.calculateArea())
}

open class Parcel {
    open fun calculateArea(): Double {
        return 0.0
    }
}

class RectangularParcel(val length: Double, val width: Double, val height: Double) : Parcel() {
    override fun calculateArea(): Double {
        return 2 * (length * height + length * width + width * height)
    }
}

class CubicalParcel(val edgeLength: Double) : Parcel() {
    override fun calculateArea(): Double {
        return 6 * edgeLength.pow(2.0)
    }
}