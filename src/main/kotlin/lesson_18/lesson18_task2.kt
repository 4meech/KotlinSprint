package org.example.lesson_18

fun main() {
    val fourDice = FourDice()
    val sixDice = SixDice()
    val eightDice = EightDice()

    val diceList: List<TheGreatDice> = listOf(fourDice, sixDice, eightDice)

    for (dice in diceList) {
        dice.throwDice()
    }
}

abstract class TheGreatDice(
    private val numberOfSides: Int,
) {
    fun throwDice() {
        println("Выпало число: " + (1..numberOfSides).random())
    }
}

class FourDice : TheGreatDice(4)

class SixDice : TheGreatDice(6)

class EightDice : TheGreatDice(8)