package org.example.lesson_6

fun main() {
    var secondsInput: Int

    do {
        println("Введите количество секунд:")
        secondsInput = readln().toIntOrNull() ?: 0
        if (secondsInput <= 0) {
            println("Ошибка: введите положительное число.")
        }
    } while (secondsInput <= 0)

    val millis = secondsInput * 1000L
    Thread.sleep(millis)
    println("Прошло $secondsInput сек.")
}