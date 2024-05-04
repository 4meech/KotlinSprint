package org.example.lesson_7

fun main() {
    val password = mutableListOf<Char>()
    var userLenInput: Int

    do {
        println("Введите длину пароля, не менее 6 символов")
        userLenInput = readln().toIntOrNull() ?: 0
        if (userLenInput < 6) {
            println("Неверный ввод, попробуйте ещё раз!")
        }
    } while (userLenInput < 6)

    val capitalCharRange = 'A'..'Z'
    val lowercaseCharRange = 'a'..'z'
    val intRange = '0'..'9'
    val allCharsRange: List<Char> = ('A'..'Z') + ('a'..'z') + ('0'..'9')

    password.add(capitalCharRange.random())
    password.add(lowercaseCharRange.random())
    password.add(intRange.random())

    for (i in 3 until userLenInput) {
        password.add(allCharsRange.random())
    }

    password.shuffle()
    println(password.joinToString(""))
}