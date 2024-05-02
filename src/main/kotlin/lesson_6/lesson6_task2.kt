package org.example.lesson_6

fun main() {

    println("Введите количество секунд:")
    val secondsInput = readln().toIntOrNull() ?: 0
    if (secondsInput <= 0) {
        println("Ошибка: введите положительное число.")
    } else {
        val millis = secondsInput * 1000L
        Thread.sleep(millis)
        println("Прошло $secondsInput сек.")
    }
}