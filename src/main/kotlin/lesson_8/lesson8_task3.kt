package org.example.lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("хлеб", "масло", "колбаса")

    println("Введите название ингредиента:")
    val userInput = readln()

    if (userInput.trim().lowercase() in arrayOfIngredients) {
        println("Ингредиент \"${userInput.trim()}\" в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}