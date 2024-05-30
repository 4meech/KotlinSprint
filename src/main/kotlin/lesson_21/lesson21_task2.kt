package org.example.lesson_21

fun main() {
    val numbers = (1..20).toList()
    println(numbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int = this.filter { it % 2 == 0 }.sum()