package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val initialDeposit = 70_000
    val interestRate = 16.7
    val depositTerm = 20

    val depositFinal = (initialDeposit * (1 + (interestRate / 100)).pow(depositTerm))

    println("Начальный размер вклада: $initialDeposit руб.")
    println("Годовая процентная ставка: $interestRate%")
    println("Срок вклада, полных лет: $depositTerm")
    //  если не обращать внимания на формат десятичного разделителя, то вывод соответствует условию
    println("К концу срока вклада сумма будет равна: ${"%.3f".format(depositFinal)} руб.")
}