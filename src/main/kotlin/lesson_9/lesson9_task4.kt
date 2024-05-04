package org.example.lesson_9

fun main() {
    println("Введите пять ингредиентов, разделяя их запятой и пробелом: ")
    val userInput = readln()
    val rawList = userInput.split(", ").map { it.trim() }
    println(rawList.sorted())
}