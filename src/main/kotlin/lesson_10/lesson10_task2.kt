package org.example.lesson_10

fun main() {
    println("Введите логин:")
    val userLogin = readln()
    println("Введите пароль:")
    val userPass = readln()

    if (validateLength(userLogin) && validateLength(userPass)) {
        println("Добро пожаловать!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun validateLength(userInput: String): Boolean = userInput.length >= 4