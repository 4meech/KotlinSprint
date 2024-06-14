package org.example.lesson_21

fun main() {
    val hello = "HELLo"
    print(hello.vowelCount())
}

fun String.vowelCount(): Int {
    val vowelsArray = charArrayOf('a','o','u','i','e','y', 'A', 'O', 'U', 'I', 'E', 'Y')
    return this.count { it in vowelsArray }
}