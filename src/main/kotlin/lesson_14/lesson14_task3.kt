package org.example.lesson_14

import kotlin.math.pow

fun main() {
    val circle1 = Circle(2.0, "Белый")
    val circle2 = Circle(6.3, "Чёрный")

    val rectangle1 = Rectangle(2.6, 6.8, "Чёрный")
    val rectangle2 = Rectangle(6.2, 4.0, "Белый")

    val listOfFigures = mutableListOf(circle1, circle2, rectangle1, rectangle2)

    var sumOfBlackPerimeters = 0.0
    var sumOfWhiteAreas = 0.0


    listOfFigures.forEach {
        when (it.color.lowercase()) {
            "чёрный" -> sumOfBlackPerimeters += it.countPerimeter()
            "белый" -> sumOfWhiteAreas += it.countArea()
        }
    }

    println("Сумма периметров всех чёрных фигур: ${"%.3f".format(sumOfBlackPerimeters)} ед.")
    println("Сумма площадей всех белыйх фигур: ${"%.3f".format(sumOfWhiteAreas)} кв.ед.")
}

abstract class Figure {
    abstract val color: String

    abstract fun countPerimeter(): Double

    abstract fun countArea(): Double
}

class Circle(
    private val circleRadius: Double,
    override val color: String,
) : Figure() {

    override fun countPerimeter(): Double {
        return (2 * Math.PI * circleRadius)
    }

    override fun countArea(): Double {
        return (2 * Math.PI * circleRadius.pow(2))
    }
}

class Rectangle(
    private val width: Double,
    private val height: Double,
    override val color: String,
) : Figure() {
    override fun countPerimeter(): Double {
        return ((width + height) * 2)
    }

    override fun countArea(): Double {
        return (width * height)
    }
}