package org.example.lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("хлеб", "масло", "колбаса")

    println("Введите название ингредиента:")
    val userInput = readln()

    for (i in arrayOfIngredients) {
        if (i == userInput.lowercase()) {
            println("Ингредиент \"$userInput\" в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}