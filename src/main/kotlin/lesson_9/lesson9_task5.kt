package org.example.lesson_9

fun main() {
    println("Введите пять ингредиентов, после каждого нажмите Enter")
    val ingredientsList = mutableListOf<String>()

    while (ingredientsList.size < 5) {
        val userInput = readln()
        ingredientsList.add(userInput.trim().lowercase())
    }

    val sortedIngredientsSet = ingredientsList.toSortedSet()

    println(sortedIngredientsSet.joinToString().replaceFirstChar { it.uppercase() })
}