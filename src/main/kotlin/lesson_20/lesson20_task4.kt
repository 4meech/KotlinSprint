package org.example.lesson_20

fun main() {
    val stringList: List<String> = listOf("String0", "String1", "String2", "String3", "String4")

    val lambdaList = stringList.mapIndexed { index, s ->
        if (index % 2 == 0) {
            println("Нажат элемент $s")
        }
    }

    lambdaList.forEach {}
}