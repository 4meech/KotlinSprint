package org.example.lesson_10

fun main() {
    val humanResult = throwDice()
    println("Кубик бросает человек... Выпало число $humanResult")
    val computerResult = throwDice()
    println("Кубик бросает компьютер... Выпало число $computerResult")

    val result = when {
        humanResult == computerResult -> "Ничья!"
        humanResult < computerResult -> "Победила машина"
        humanResult > computerResult -> "Победило человечество"
        else -> ""
    }

    println(result)
}

fun throwDice(): Int = (1..6).random()