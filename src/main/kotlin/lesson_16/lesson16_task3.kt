package org.example.lesson_16

fun main() {
    val userPass = UserPassword()

    println("Введите пароль:")
    if (userPass.checkUserInput(readln())) {
        println("Пароль верный")
    } else {
        println("Пароль неверный")
    }
}

private class UserPassword {
    private val userName = "John Doe III"
    private val userPass = "qwerty12345"

    fun checkUserInput(userInput: String) : Boolean {
        return userInput == this.userPass
    }
}