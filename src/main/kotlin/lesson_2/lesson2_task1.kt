package org.example.lesson_2

fun main() {
    val studentsTotal = 4

    val score1 = 3
    val score2 = 4
    val score3 = 3
    val score4 = 5

//  в рамках задачи не хочется целочисленные переменные явно приводить к дробным
    val averageScore = (score1 + score2 + score3 + score4).toDouble() / studentsTotal

    println("Средний былл класса по английскому языку: ${averageScore}")
}