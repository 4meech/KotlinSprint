package org.example.lesson_7

fun main() {
    var authCode: Int

    do {
        authCode = (1000..9999).random()
        println("Ваш код авторизации: $authCode")
        print("Введите код авторизации: ")
        val userInput = readln().toInt()
    } while (userInput != authCode)

    println("Код верный! Добро пожаловать!")
}