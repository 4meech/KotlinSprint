package org.example.lesson_21

fun main() {
    val numbers = (1..20).toList()
    println(numbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    var sumEven = 0

    for (i in this) {
        if (i % 2 == 0) {
            sumEven += i
        }
    }
    return sumEven
}