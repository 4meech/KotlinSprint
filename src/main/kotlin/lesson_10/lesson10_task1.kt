package org.example.lesson_10

fun main() {
    val humanResult = throwDiceFirst()
    println("Кубик бросает человек... Выпало число $humanResult")
    val computerResult = throwDiceFirst()
    println("Кубик бросает компьютер... Выпало число $computerResult")

    val result = when {
        humanResult == computerResult -> "Ничья!"
        humanResult < computerResult -> "Победила машина"
        humanResult > computerResult -> "Победило человечество"
        else -> ""
    }

    println(result)
}

fun throwDiceFirst(): Int = (1..6).random()