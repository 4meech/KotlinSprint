package org.example.lesson_6

fun main() {
    var counter = 0
    var secondsInput: Int

    do {
        println("Введите количество секунд:")
        secondsInput = readln().toIntOrNull() ?: 0
        if (secondsInput <= 0) {
            println("Ошибка: введите положительное число.")
        }
    } while (secondsInput <= 0)

    while (counter < secondsInput - 1) {
        Thread.sleep(1000)
        println("Осталось секунд: ${secondsInput - ++counter}")
    }
    Thread.sleep(1000)
    println("Время вышло")
}