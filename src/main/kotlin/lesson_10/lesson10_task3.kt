package org.example.lesson_10

fun main() {
    println("Введите желаемую длину пароля:")
    val passLength = readln().toInt()

    println(generatePassword(passLength))
}

fun generatePassword(passLength: Int): String {
    val specialCharsRange = ' '..'/'
    val digitsRange = 0..9
    var password = ""

    for (i in 1 .. passLength)
        if (i % 2 == 0) {
            password += specialCharsRange.random()
        } else {
            password += digitsRange.random()
        }
    return password
}