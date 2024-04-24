package org.example.lesson_3

const val USERNAME = "Юзернейм" // Нормально ли присываивать константам значения на кириллице?

fun main () {
    var greetingsMessage = "Добрый день, "
    println("$greetingsMessage$USERNAME!")

    // наступает вечер, Юзернейм засыпает, просыпается другой вариант вывода
    greetingsMessage = "Добрый вечер, "
    println(greetingsMessage + USERNAME + "!")
}