package org.example.lesson_3

const val USERNAME = "Иван"

fun main () {
    var greetingsMessage = "Добрый день,"

    println("$greetingsMessage $USERNAME!")
    greetingsMessage = "Добрый вечер,"
    println("$greetingsMessage $USERNAME!")
}