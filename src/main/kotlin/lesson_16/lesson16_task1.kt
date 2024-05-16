package org.example.lesson_16

fun main() {
    val dice = DiceOne()

    dice.printDiceNumber()
}

class DiceOne {
    private val number = (1..6).random()

    fun printDiceNumber() {
        println("Выпало число $number")
    }
}