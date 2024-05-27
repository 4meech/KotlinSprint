package org.example.lesson_20

fun main() {
    val username = "John Doe"
    val sayHelloWithLambda: () -> Unit = { println("С наступающим Новым Годом, $username!") }

    sayHelloWithLambda()
}