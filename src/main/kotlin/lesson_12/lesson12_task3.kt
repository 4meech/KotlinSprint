package org.example.lesson_12

const val DAY_TEMP_KELVIN = 308
const val NIGHT_TEMP_KELVIN = 296
const val CELSIUS_OFFSET = 273

fun main() {
    val weatherCentigrade = WeatherKelvin(DAY_TEMP_KELVIN, NIGHT_TEMP_KELVIN, true)
    weatherCentigrade.printWeather()
}

class WeatherKelvin(_dayTemp: Int, _nightTemp: Int, _wasPrecipitation: Boolean) {

    val dayTemp = _dayTemp - CELSIUS_OFFSET
    val nightTemp = _nightTemp - CELSIUS_OFFSET
    var wasPrecipitation = _wasPrecipitation

    fun printWeather() {
        println("Дневная температура:   $dayTemp℃")
        println("Ночная температура:    $nightTemp℃")
        println("Были ли осадки:        $wasPrecipitation")
        println()
    }
}