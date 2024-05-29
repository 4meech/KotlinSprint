package org.example.lesson_21

fun main() {
    val hello = "HELLO"
    print(hello.lowercase().vowelCount())
}

fun String.vowelCount(): Int {
    var counter = 0

    val vowelsArray = charArrayOf('a','o','u','i','e','y')
    for (i in this) {
        if (i in vowelsArray) counter++
    }
    return counter
}