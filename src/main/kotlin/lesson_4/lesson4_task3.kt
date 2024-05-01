package org.example.lesson_4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val HUMIDITY_PERCENT_FAVORABLE = 20
val seasonFavorable = listOf("Весна", "Лето", "Осень")

fun main() {
    val isSunnyNow = true
    val isAwningOpenNow = true
    val humidityPercentNow = 20
    val seasonNow = "Зима"

    val isFavorable = (isSunnyNow == IS_SUNNY
            && isAwningOpenNow == IS_AWNING_OPEN
            && humidityPercentNow == HUMIDITY_PERCENT_FAVORABLE
            && seasonFavorable.contains(seasonNow))

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorable")
}