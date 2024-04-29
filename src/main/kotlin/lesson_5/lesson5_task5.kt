package org.example.lesson_5

fun main() {
    val winNumbers = generateWinNumbers()
    val userNumbers = getUserNumbers()

    val matchCount = winNumbers.intersect(userNumbers).size

    when (matchCount) {
        3 -> println("Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали всего одно число – получите утешительный приз в кассе!")
        else -> println("Увы, вы не угадали ни одного числа!")
    }
    println("Были загаданы числа: $winNumbers")
}

fun generateWinNumbers(): List<Int> {
    val rawNumbers = (0..42).toMutableList()
    rawNumbers.shuffle()
    return rawNumbers.subList(0, 3)
}

fun getUserNumbers(): List<Int>{
    val userNumbers: MutableList<Int> = mutableListOf()
    println("Введите три числа от 0 до 42, после каждого числа нажмите Enter: ")
    for (i in 0..2) {
        val userInput = readln().toInt()
        userNumbers.add(userInput)
    }
    return userNumbers
}