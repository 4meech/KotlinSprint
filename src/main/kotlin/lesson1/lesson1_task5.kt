package org.example.lesson1

const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60

fun main() {
    val totalSeconds = 6480

    val hoursInSpace = totalSeconds / SECONDS_IN_HOUR
    val minutesInSpace = (totalSeconds % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val secondsInSpace = totalSeconds % SECONDS_IN_MINUTE

//  применяем интерполяцию сразу ко всей строке вывода
    println("%02d:%02d:%02d".format(hoursInSpace, minutesInSpace, secondsInSpace))
}