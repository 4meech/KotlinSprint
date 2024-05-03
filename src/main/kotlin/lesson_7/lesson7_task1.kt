package org.example.lesson_7

fun main() {
    var password = ""
    val charArray = 'a'..'z'
    val intArray = 0..9

    for (i in 1..6) {
        if (i % 2 == 0) {
            val randInt = intArray.random()
            password += randInt
        } else {
            val randChar = charArray.random()
            password += randChar
        }
    }

    println(password)
}