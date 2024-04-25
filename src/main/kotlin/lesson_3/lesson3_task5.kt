package org.example.lesson_3

fun main() {
    val rawMoveRecieved = "D2-D4;0"

    val fromPos = rawMoveRecieved.substring(0, 2)
    val toPos = rawMoveRecieved.substring(3, 5)
    // а номер хода парсим не по индексу, а по разделителю ";", потому что а почему бы и нет?
    val moveNumber = rawMoveRecieved.split(";").last()

    println("""
        |Откуда: $fromPos 
        |Куда: $toPos
            |Номер хода: $moveNumber
    """.trimMargin())
}