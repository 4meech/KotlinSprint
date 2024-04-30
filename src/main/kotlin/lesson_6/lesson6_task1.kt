package org.example.lesson_6

var userName = ""
var userPass = ""

fun main() {
    createUser()
    authUser()
}

fun createUser() {
    println("""
        Начинаем процесс регистрации нового пользователя
        Введите имя пользователя, которое хотите зарегистрировать:
    """.trimIndent())
    var userInput = readln()
    while (userInput.isEmpty()) {
        println("Имя пользователя не может быть пустым. Попробуйте ещё раз")
        userInput = readln()
    }
    userName = userInput

    println("Введите пароль:")
    userInput = readln()
    while (userInput.isEmpty()) {
        println("Пароль не может быть пустым. Попробуйте ещё раз")
        userInput = readln()
    }
    userPass = userInput
    println("Регистрация прошла успешно!")
}

fun authUser() {
    var isAuthorised = false
    do {
        print("Введите имя пользователя: ")
        val userNameInput = readln()
        print("Введите пароль: ")
        val userPassInput = readln()

        if (userNameInput == userName && userPassInput == userPass) {
            print("Вы авторизованы!")
            isAuthorised = true
        } else {
            println("Неверные имя пользователя или пароль. Попробуйте ещё раз.")
        }
    } while (!isAuthorised)
}