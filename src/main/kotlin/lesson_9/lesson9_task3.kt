package org.example.lesson_9

const val EGGS_PER_SERVING = 2
const val MILK_PER_SERVING = 50
const val BUTTER_PER_SERVING = 15

fun main() {
    val listOfIngredients = listOf(EGGS_PER_SERVING, MILK_PER_SERVING, BUTTER_PER_SERVING)

    println("Введите количество порций: ")
    val userInput = readln().toInt()

    val listIngredientsTotal = listOfIngredients.map {
        it * userInput
    }

    println("""
        На $userInput пор. вам понадобится:
        Яиц — ${listIngredientsTotal[0]} шт
        Молока — ${listIngredientsTotal[1]} мл
        Сливочного масла — ${listIngredientsTotal[2]} гр
    """.trimIndent())
}