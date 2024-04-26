package org.example.lesson_5

const val FIRST_WIN_NUMBER = 42
const val SECOND_WIN_NUMBER = 24

fun main() {
    print("Введите первое число:")
    val firstNumber = readln().toIntOrNull() ?: -1
    print("Введите второе число: ")
    val secondNumber = readln().toIntOrNull() ?: -1

    val result = if ((firstNumber == FIRST_WIN_NUMBER || firstNumber == SECOND_WIN_NUMBER)
        && (secondNumber == FIRST_WIN_NUMBER || secondNumber == SECOND_WIN_NUMBER)
    ) "Поздравляем! Вы выиграли главный приз!"
    else if (firstNumber == FIRST_WIN_NUMBER || firstNumber == SECOND_WIN_NUMBER
        && secondNumber == FIRST_WIN_NUMBER || secondNumber == SECOND_WIN_NUMBER
    ) "Вы выиграли утешительный приз!"
    else "Неудача!"

    println(result)
    println("Были загаданы числа: $FIRST_WIN_NUMBER и $SECOND_WIN_NUMBER")
}