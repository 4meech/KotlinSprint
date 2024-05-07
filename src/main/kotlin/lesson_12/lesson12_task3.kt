package org.example.lesson_12

fun main() {
    val weatherCentigrade = WeatherKelvin(308, 290, true)
    weatherCentigrade.printWeather()
}

class WeatherKelvin(_dayTemp: Int, _nightTemp: Int, _wasPrecipitation: Boolean) {

    val dayTemp = _dayTemp
    val nightTemp = _nightTemp
    var wasPrecipitation = _wasPrecipitation

    fun printWeather() {
        println("Дневная температура:   ${dayTemp - 273}℃")
        println("Ночная температура:    ${nightTemp - 273}℃")
        println("Были ли осадки:        $wasPrecipitation")
        println()
    }
}