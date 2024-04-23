package org.example.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffPercentage = 0.20

    val bonusCrystals = (crystalOre * buffPercentage).toInt()
    val bonusIron = (ironOre * buffPercentage).toInt()

    println("Бонус к кристаллической руде: +${bonusCrystals}")
    println("Бонус к железной руде: +${bonusIron}")
}