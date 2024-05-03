package org.example.lesson_8

fun main() {
   println("Введите количество ингредиентов: ")
    val numOfIngredients = readln().toInt()
    val arrayOfIngredients = Array(numOfIngredients) {""}

    for (i in arrayOfIngredients.indices) {
        print("Введите ингредиент №${i + 1}: ")
        arrayOfIngredients[i] = readln()
    }
    print(arrayOfIngredients.contentToString())
}