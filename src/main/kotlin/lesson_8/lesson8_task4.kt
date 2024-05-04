package org.example.lesson_8

fun main() {
    val arrayOfIngridients = arrayOf("хлеб", "масло", "колбаса", "сыр")
    println(arrayOfIngridients.contentToString())

    println("Какой ингредиент меняем?")
    val ingredientToRemove = readln()
    val newIngredient: String
    val indexToReplace: Int

    if (arrayOfIngridients.contains(ingredientToRemove.lowercase())) {
        indexToReplace = arrayOfIngridients.indexOf(ingredientToRemove.lowercase())
        println("На что меняем?")
        newIngredient = readln().lowercase()
        arrayOfIngridients[indexToReplace] = newIngredient
        println(
            """
            Готово! Вы сохранили следующий список:
            ${arrayOfIngridients.contentToString()}
        """.trimIndent()
        )
    } else {
        println("Такого ингредиента нет, рецепт остаётся неизменным")
    }
}