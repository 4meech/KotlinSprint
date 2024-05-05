package org.example.lesson_11

fun main() {
    val chuckN = User2(
        id = 2042,
        login = "Chuck Norris",
        password = "password",
        email = "Chuck@norris.com",
        bio = null
    )

    chuckN.printInfo()
    chuckN.editBio()
    chuckN.changePassword()
    chuckN.printInfo()
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String?,
) {

    fun printInfo() {
        println("Сведения о пользователе: ")
        println("Индентификатор:    $id")
        println("Имя пользователя:  $login")
        println("Пароль:            $password")
        println("Почта:             $email")
        if (bio != null) {
            println(bio)
        } else {
            return
        }
    }

    fun editBio() {
        println("Введите информацию о себе: ")
        val userBio = readln()
        bio = userBio
    }

    fun changePassword() {
        println("Для изменения пароля введите текущий пароль: ")
        var userInput = readln()
        if (userInput == password) {
            println("Введите новый пароль: ")
            userInput = readln()
            password = userInput
            println("Пароль успешно изменён!")
            println()
        } else {
            println("Неверный пароль.")
            println()
        }
    }
}