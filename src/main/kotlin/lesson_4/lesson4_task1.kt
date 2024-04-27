package org.example.lesson_4
//  давно не было Byte
const val TABLE_COUNT: Byte = 13

fun main() {
    val bookedToday: Byte = 13
    val bookedTomorrow: Byte = 9

    println("Доступность столиков на сегодня: ${bookedToday < TABLE_COUNT}")
    println("Доступность столиков на завтра: ${bookedTomorrow < TABLE_COUNT}")
}