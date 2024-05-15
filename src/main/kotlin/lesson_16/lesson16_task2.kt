package org.example.lesson_16

import kotlin.math.pow

const val RADIUS = 10.0

fun main() {
    val circle = CircleOne(RADIUS)

    println(circle.countLength())
    println(circle.countArea())
}

class CircleOne(private val radius: Double) {

    fun countLength(): Double = (2 * MyConst.PI * radius)
    fun countArea(): Double = (MyConst.PI * radius.pow(2))
}

private object MyConst{
    const val PI = 3.14
}