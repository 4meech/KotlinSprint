package org.example.lesson_8

fun main() {
    println("Введите количество ингредиентов: ")

    val arrayOfIngredients = Array(readln().toInt()) {
        print("Введите ингредиент №${it + 1}: ")
        readln()
    }

    print(arrayOfIngredients.joinToString())
}