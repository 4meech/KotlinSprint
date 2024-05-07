package org.example.lesson_11

fun main() {
    val burgersCategory = Category("Бургеры")

    val burgerMushroomsCheese = Recipe(
        "Бургер с грибами и сыром", burgersCategory,
        mapOf(
            "Творог" to Pair(100, "гр."),
            "Куриное яйцо" to Pair(1, "шт."),
            "Пшеничная мука" to Pair(2, "ст.л."),
            "Сахар" to Pair(1, "ст.л."),
        )
    )
}

class Category(
    val categoryName: String,
    val recipesList: MutableList<Recipe> = mutableListOf(),
)

class Recipe(
    val recipeName: String,
    private val categoryName: Category,
    val ingredients: Map<String, Pair<Int, String>>,
) {
    init {
        categoryName.recipesList.add(this)
    }
}