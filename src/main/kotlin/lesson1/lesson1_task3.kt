package org.example.lesson1

fun main() {
    val year: Short = 1961 // Оставим Short. Вряд ли эта дата изменится
    var hour = "09"
    var minute = "07"

    println(year)
    println(hour)
    println(minute)

    hour = "10"
    minute = "55"
    println("${hour}:${minute}")
}