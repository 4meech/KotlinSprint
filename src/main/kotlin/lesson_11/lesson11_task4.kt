package org.example.lesson_11

class Category(
    val categoryName: String,
    val recipesList: MutableList<Recipe> = mutableListOf(),
)

class Recipe(
    val recipeName: String,
    private val categoryName: Category,
    val ingredients: MutableList<Ingredient> = mutableListOf(),
)

class Ingredient(
    val ingredientName: String,
    val ingredientAmount: Int,
    val ingredientMeasureUnit: String,
)