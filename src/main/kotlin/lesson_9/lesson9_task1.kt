package org.example.lesson_9

fun main() {
    val listOfIngredients = listOf("масло", "хлеб", "сыр", "колбаса")

    println("В рецепте есть следующие ингредиенты: ")
    listOfIngredients.forEach { ingredient ->
        println(ingredient)
    }
}