package org.example.lesson_11

fun main() {
    val userJohn = User(
        id = 1021,
        login = "JohnDoe",
        password = "qwerty",
        email = "JohnD@yahoo.com",
    )
    val userJane = User(
        id = 1022,
        login = "JaneDoe",
        password = "asdfg",
        email = "JaneD@yahoo.com",
    )

    println("Сведения о пользователе #1: ")
    println("Индентификатор:    ${userJohn.id}")
    println("Имя пользователя:  ${userJohn.login}")
    println("Пароль:            ${userJohn.password}")
    println("Почта:             ${userJohn.email}")
    println("——————————————————————————————————")
    println("Сведения о пользователе #2: ")
    println("Индентификатор:    ${userJane.id}")
    println("Имя пользователя:  ${userJane.login}")
    println("Пароль:            ${userJane.password}")
    println("Почта:             ${userJane.email}")
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)