package org.example.lesson_8

fun main() {
    val arrayOfIngridients = arrayOf("хлеб", "масло", "колбаса")

    println("Введите название ингредиента:")
    val userInput = readln()
    var hasIngridient = false

    for (i in arrayOfIngridients) {
        if (i == userInput.lowercase()) {
            println("Ингредиент \"$userInput\" в рецепте есть")
            hasIngridient = true
            break
        }
    }
    if (!hasIngridient) {
        println("Такого ингредиента в рецепте нет")
    }
}