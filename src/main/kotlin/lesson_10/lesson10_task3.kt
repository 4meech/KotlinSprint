package org.example.lesson_10

fun main() {
    println("Введите желаемую длину пароля:")
    println(generatePassword())
}

fun generatePassword(passLength: Int = readln().toInt()): String {
    val specialCharsList = listOf('!', '"', '#', '$', '%', '&', '(', ')', '*', '+', ',', '-', '.', '/', ' ')
    val digitsList = listOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')
    val password = mutableListOf<Char>()

    for (i in 1 .. passLength)
        if (i % 2 == 0) {
            password.add(specialCharsList.random())
        } else {
            password.add(digitsList.random())
        }
    return password.joinToString("")
}