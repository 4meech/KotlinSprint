package org.example.lesson_16

import kotlin.math.pow

const val RADIUS = 10.0
private const val PI = 3.14

fun main() {
    val circle = CircleOne(RADIUS)

    println(circle.countLength())
    println(circle.countArea())
}

class CircleOne(private val radius: Double) {

    fun countLength(): Double = (2 * PI * radius)
    fun countArea(): Double = (PI * radius.pow(2))
}