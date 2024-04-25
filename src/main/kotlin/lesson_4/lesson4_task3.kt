package org.example.lesson_4

fun main() {
    val isSunny = true
    val tentIsOpen = true
    val humidity = 20
    val season = "Зима"
//  проверяем благоприятные ли условия
    val isFavorable = (isSunny && tentIsOpen && humidity == 20 && !season.equals("зима", ignoreCase = true))
    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorable")
}