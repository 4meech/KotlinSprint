package org.example.lesson_7

fun main() {
    print("Введите число: ")
    val userInput = readln().toInt()
    for (i in 0..userInput step 2) {
        println(i)
    }
}