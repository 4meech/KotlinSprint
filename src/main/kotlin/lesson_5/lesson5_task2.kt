package org.example.lesson_5

import java.time.Year

const val AGE_OF_MAJORITY = 18

fun main() {
    val currentYear = Year.now().value

    println("Введите год рождения")
    val userAge = readln().toInt()

    val resultText = if ((currentYear - userAge) >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else "Доступ запрещён"
    println(resultText)
}