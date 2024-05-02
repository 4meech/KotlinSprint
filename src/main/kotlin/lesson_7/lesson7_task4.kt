package org.example.lesson_7

fun main() {
    println("Введите количество секунд: ")
    val secondsInput = readln().toInt()

    for (i in secondsInput downTo 1) {
        println("Осталось $i сек.")
        Thread.sleep(1000)
    }

    println("Время вышло!")
}