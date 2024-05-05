package org.example.lesson_10

fun main() {
    println("Введите логин:")
    val userLogin = readln()
    println("Введите пароль:")
    val userPass = readln()

    println(validateLength(userLogin, userPass))
}

fun validateLength(userLogin: String, userPass: String): String {
    return when {
        (userLogin.length < 4 || userPass.length < 4) -> "Логин или пароль недостаточно длинные"
        else -> "Добро пожаловать!"
    }
}