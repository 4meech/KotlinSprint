package org.example.lesson_5

fun main() {
    val (firstNumber, secondNumber) = 2 to 7
    val correctAnswer = firstNumber + secondNumber

    println(
        """
        Ваши запросы похожи на автоматические. Докажите, что вы не робот:
        Сколько будет "$firstNumber + $secondNumber"? Введите ответ:
    """.trimIndent()
    )

    val answerInput = readln().toIntOrNull()
    if (answerInput != null)
        when (answerInput) {
            correctAnswer -> println("Добро пожаловать!")
            else -> println("Доступ запрещён!")
        }
    else {
        println("Неверный формат. Введите числовой ответ. Попробуйте ещё раз.")
    }
}