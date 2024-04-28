package org.example.lesson_4

fun main() {
    var (isHands, isAbs) = false to false
    var (isLegs, isBack) = false to false
    val currentDay = 5

    when (currentDay % 2) {
        0 -> {
            isLegs = true
            isBack = true
        }
        1 -> {
            isHands = true
            isAbs = true
        }
    }

    println("""
        Упражнения для рук:      $isHands
        Упражнения для ног:      $isLegs
        Упражнения для спины:    $isBack
        Упражнения для пресса:   $isAbs
    """.trimIndent())
}