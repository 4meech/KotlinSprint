package org.example.lesson_2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val minutesEnRoute = 457
//    Приводим всё к минутам и проверяем на прибытие в следующий календарный день (60 * 24)
    val minutesTotal = (departureHour * 60 + departureMinute + minutesEnRoute) % 1440
    val arrivalHour = minutesTotal / 60
    val arrivalMinute = minutesTotal % 60
//    Форматируем вывод для корректного отображения значений час/мин с ведущим нулём
    println("Время прибытия поезда: " + "%02d:%02d".format(arrivalHour, arrivalMinute))
}