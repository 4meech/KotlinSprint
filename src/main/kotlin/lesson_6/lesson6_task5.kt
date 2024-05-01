package org.example.lesson_6

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    println("Создайте логин")
    val logUser = readln()
    println("Придумайте пароль")
    val passUser = readln()
    println("Регистрация прошла успешно")

    do {
        println("Введите логин")
        val logEnter = readln()
        println("Введите пароль")
        val passEnter = readln()
    } while (logEnter != logUser || passEnter != passUser)

    var tryCount = 3

    while (tryCount > 0) {
        val captchaNumA = Random.nextInt(1..9)
        val captchaNumB = Random.nextInt(1..9)
        val captchaAnswer = captchaNumA + captchaNumB

        println(
            """
            Для продолжения решите пример:
            Сколько будет '$captchaNumA + $captchaNumB'?
        """.trimIndent()
        )
        val userInput = readln().toInt()
        if (userInput == captchaAnswer) {
            println("Добро пожаловать!")
            return
        } else {
            println("Неверно. Попробуйте ещё раз!")
            tryCount--
        }
    }
    println("Доступ запрещён")
}