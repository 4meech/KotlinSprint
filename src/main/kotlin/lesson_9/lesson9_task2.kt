package org.example.lesson_9

fun main() {
    val listOfIngredients = mutableListOf("масло", "хлеб", "колбаса")

    println("В рецепте есть базовые ингредиенты: ")
    listOfIngredients.forEach { ingredient ->
        println(ingredient)
    }

    println("Желаете добавить ещё?")
    val userAnswer = readln()

    if (userAnswer.trim().lowercase() == "да") {
        println("Какой ингредиент вы хотите добавить?")
        val userIngredient = readln().trim().lowercase()
        listOfIngredients.add(userIngredient)
    } else {
        return
    }

    println("Теперь в рецепте есть следующие ингредиенты: ")
    listOfIngredients.forEach { ingredient ->
        println(ingredient)
    }
}