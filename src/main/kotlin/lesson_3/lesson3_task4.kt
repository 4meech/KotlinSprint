package org.example.lesson_3

fun main() {
    var fromPos = "E2"
    var toPos = "E4"
    var moveNumber = 1


    var moveToSend = "[${fromPos}-${toPos};${moveNumber}]"
    println(moveToSend)

    fromPos = "D2"
    // не знаю как это реализовать в рамках знаний только из трёх уроков, поэтому парсим позицию фигуры D2
    var parsedLiteral = fromPos[0]
    var parsedNumber = fromPos[1].toString().toInt()

    // будем счиать, что чёрные дают фору, белые делают ход №2
    toPos = "${parsedLiteral}${parsedNumber + 1}"
    moveNumber++

    moveToSend = "[${fromPos}-${toPos};${moveNumber}]"
    println(moveToSend)
}