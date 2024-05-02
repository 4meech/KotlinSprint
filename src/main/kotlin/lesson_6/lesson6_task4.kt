package org.example.lesson_6

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val winNumber = Random.nextInt(1..9)
    var tryCount = 5
    println("Попробуйте отгадать! Введите число в промежутке от 1 до 9: ")
    do {
        val userInput = readln().toIntOrNull() ?: 0
        tryCount--
        if (userInput !in 1..9) {
            println("Это не число в промежутке от 1 до 9. Минус попытка, их осталось $tryCount")
            continue
        }
        if (userInput == winNumber) {
            println("Это была великолепная игра!")
            return
        } else {
            println("Неверно. Осталось попыток: $tryCount")
        }
    } while (tryCount > 0)

    println("Было загадано число $winNumber")
}