package org.example.lesson_10

fun main() {
    var humanWinCount = 0

    do {
        val humanResult = throwDice()
        println("Кубик бросает человек... Выпало число $humanResult")
        val computerResult = throwDice()
        println("Кубик бросает компьютер... Выпало число $computerResult")


        val result = when {
            humanResult == computerResult -> "Ничья!"
            humanResult < computerResult -> "Победила машина"
            humanResult > computerResult -> {
                humanWinCount++
                "Победило человечество"
            }
            else -> ""
        }
        println(result)
    } while (continueGame())

    println("Количество выигранных человечеством партий: $humanWinCount")
}

fun throwDice(): Int = (1..6).random()

fun continueGame(): Boolean {
    println("Желаете продолжить? Введите 'Да' или 'Нет':")
    when (readln().lowercase()) {
        "да" -> return true
        "нет" -> return false
        else -> {
            println("Неверный ввод. Игра остановлена!")
            return false
        }
    }
}