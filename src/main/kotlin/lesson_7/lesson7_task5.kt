package org.example.lesson_7

fun main() {
    var password = ""
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
    val charRanges = listOf(capitalCharRange, lowercaseCharRange, intRange)
    var hasCapital = false
    var hasLower = false
    var hasDigit = false

    do {
        for (i in 1..userLenInput) {
            val randomRange = charRanges.random()
            val randomChar = randomRange.random()
            password += randomChar

            if (intRange.contains(randomChar)) {
                hasDigit = true
            } else if (capitalCharRange.contains(randomChar)) {
                hasCapital = true
            } else if (lowercaseCharRange.contains(randomChar)) {
                hasLower = true
            }
        }
    } while (!(hasDigit && hasCapital && hasLower))

    println(password)
}