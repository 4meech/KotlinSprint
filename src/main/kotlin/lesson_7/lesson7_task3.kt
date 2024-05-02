package org.example.lesson_7

fun main() {
    print("Введите число: ")
    val userInput = readln().toInt()
    val intRange: IntProgression = (0 .. userInput step 2)
    var result = ""

    for (i in intRange) {
        result += i
    }

    print(result)
}