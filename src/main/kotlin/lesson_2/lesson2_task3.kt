package org.example.lesson_2

const val MINUTES_IN_HOUR = 60
//  Считаем, что количество часов в сутках строго равно 24 :)
const val HOURS_IN_DAY = 24
//  Если допускается рассчитывать значение константы таким образом, то оставим так
const val MINUTES_IN_DAY = MINUTES_IN_HOUR * HOURS_IN_DAY

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val minutesEnRoute = 457
//    Приводим всё к минутам и проверяем на прибытие в следующий календарный день (делим на количество минут в дне)
    val minutesTotal = (departureHour * MINUTES_IN_HOUR + departureMinute + minutesEnRoute) % MINUTES_IN_DAY
    val arrivalHour = minutesTotal / MINUTES_IN_HOUR
    val arrivalMinute = minutesTotal % MINUTES_IN_HOUR
//    Форматируем вывод для корректного отображения значений час/мин с ведущим нулём
    println("Время прибытия поезда: " + "%02d:%02d".format(arrivalHour, arrivalMinute))
}