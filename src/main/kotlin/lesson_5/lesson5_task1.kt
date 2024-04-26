package org.example.lesson_5

const val CORRECT_ANSWER = 9

fun main() {
    println(
        """
        Ваши запросы похожи на автоматические. Докажите, что вы не робот:
        Сколько будет "2 + 7"? Введите ответ:
    """.trimIndent()
    )

    val answerInput = readln().toIntOrNull()
    if (answerInput != null)
        when (answerInput) {
            CORRECT_ANSWER -> println("Добро пожаловать!")
            else -> println("Доступ запрещён!")
        }
    else {
        println("Неверный формат. Введите числовой ответ. Попробуйте ещё раз.")
    }
}