package org.example.lesson_4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val HUMIDITY_PERCENT = 20
const val SEASON = "Зима"

fun main() {
    val isFavorable = (IS_SUNNY && IS_AWNING_OPEN && HUMIDITY_PERCENT == 20
            && !SEASON.equals("зима", ignoreCase = true))
    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorable")
}