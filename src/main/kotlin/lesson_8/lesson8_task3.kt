package org.example.lesson_8

fun main() {
    val arrayOfIngridients = arrayOf("хлеб", "масло", "колбаса")

    println("Введите название ингредиента:")
    val userInput = readln()
    val hasIngridient = arrayOfIngridients.contains(userInput.lowercase())

    if (hasIngridient) {
        println("Ингредиент \"$userInput\" в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}