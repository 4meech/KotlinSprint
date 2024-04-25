package org.example.lesson_2

const val BUFF_PERCENT = 20

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffPercentage = BUFF_PERCENT * 0.01

    val bonusCrystals = (crystalOre * buffPercentage).toInt()
    val bonusIron = (ironOre * buffPercentage).toInt()

    println("Бонус к кристаллической руде: +${bonusCrystals}")
    println("Бонус к железной руде: +${bonusIron}")
}