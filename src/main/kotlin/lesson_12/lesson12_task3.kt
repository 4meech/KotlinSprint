package org.example.lesson_12

const val DAY_TEMP__KELVIN = 308
const val NIGHT_TEMP__KELVIN = 296
const val CELSIUS__OFFSET = 273

fun main() {
    val weatherCentigrade = WeatherKelvin(DAY_TEMP__KELVIN, NIGHT_TEMP__KELVIN, true)
    weatherCentigrade.printWeather()
}

class WeatherKelvin(_dayTemp: Int, _nightTemp: Int, _wasPrecipitation: Boolean) {

    val dayTemp = _dayTemp - CELSIUS__OFFSET
    val nightTemp = _nightTemp - CELSIUS__OFFSET
    var wasPrecipitation = _wasPrecipitation

    fun printWeather() {
        println("Дневная температура:   $dayTemp℃")
        println("Ночная температура:    $nightTemp℃")
        println("Были ли осадки:        $wasPrecipitation")
        println()
    }
}