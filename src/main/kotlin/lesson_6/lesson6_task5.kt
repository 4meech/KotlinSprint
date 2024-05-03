package org.example.lesson_6

fun main() {

    var tryCount = 3

    while (tryCount > 0) {
        val captchaNumA = (1..9).random()
        val captchaNumB = (1..9).random()
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
            print("Неверно! ")
            if (tryCount > 1) {
                println("Попробуйте ещё раз.")
            }
            tryCount--
        }
    }
    println("Доступ запрещён!")
}