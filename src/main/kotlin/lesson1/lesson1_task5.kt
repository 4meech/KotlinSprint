package org.example.lesson1

fun main() {
    val totalSeconds = 6480

    val hours = totalSeconds / 3600
    val minutes = (totalSeconds % 3600) / 60
    val seconds = "%02d".format(totalSeconds % 60)

    println("Время, проведенное в космосе: ${hours}:${minutes}:${seconds}")
}
