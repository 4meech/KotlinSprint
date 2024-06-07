package org.example.lesson_13

import java.lang.NumberFormatException

fun main() {
    println("Введите имя: ")
    val username = readlnOrNull() ?: ""
    println("Введите номер телефона: ")
    val userPhone = readln()

    try {
        val user = Subscriber5(username, userPhone.toLong())
    } catch (e: NumberFormatException) {
        println("Запись не создана, ошибка:\n$e")
    }
}

class Subscriber5(
    private val name: String,
    private val phoneNumber: Long,
    private val company: String? = null,
)
