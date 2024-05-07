package org.example.lesson_12

fun main() {

    val weatherTodayMsk = WeatherToday()
    val weatherTodaySpb = WeatherToday()

    weatherTodaySpb.dayTemp = 22
    weatherTodaySpb.nightTemp = 12
    weatherTodaySpb.wasPrecipitation = true

    weatherTodayMsk.dayTemp = 25
    weatherTodayMsk.nightTemp = 16

    weatherTodayMsk.printWeather()
    weatherTodaySpb.printWeather()
}

class WeatherToday {

    var dayTemp = 0
    var nightTemp = 0
    var wasPrecipitation = false

    fun printWeather() {
        println("Дневная температура:   $dayTemp")
        println("Ночная температура:    $nightTemp")
        println("Были ли осадки:        $wasPrecipitation")
        println()
    }
}