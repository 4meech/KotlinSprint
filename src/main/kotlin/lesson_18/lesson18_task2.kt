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

open class TheGreatDice {
    open fun throwDice() {
        println((1..4).random())
    }
}

class FourDice(
    private val numberOfSides: Int = 4
) : TheGreatDice() {
    override fun throwDice() {
        println("Выпало число " + (1..numberOfSides).random())
    }
}

class SixDice(
    private val numberOfSides: Int = 6
) : TheGreatDice() {
    override fun throwDice() {
        println("Выпало число " + (1..numberOfSides).random())
    }
}

class EightDice(
    private val numberOfSides: Int = 8
) : TheGreatDice() {
    override fun throwDice() {
        println("Выпало число " + (1..numberOfSides).random())
    }
}