package org.example.lesson_12

fun main() {
    val weatherMsk = WeatherWeather(25, 16, true)

    weatherMsk.printWeather()
}

class WeatherWeather(
    private val dayTemp: Int,
    private val nightTemp: Int,
    private val wasPrecipitation: Boolean,
) {
    fun printWeather() {
        println("Дневная температура:   $dayTemp")
        println("Ночная температура:    $nightTemp")
        println("Были ли осадки:        $wasPrecipitation")
        println()
    }
}