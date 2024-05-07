package org.example.lesson_12

fun main() {
    val weatherCentigrade = WeatherCentigrade(308, 290, false)
}

class WeatherCentigrade(_dayTemp: Int, _nightTemp: Int, _wasPrecipitation: Boolean) {

    val dayTemp = _dayTemp
    val nightTemp = _nightTemp
    var wasPrecipitation = _wasPrecipitation

    init {
        println("Дневная температура:   ${this.dayTemp - 273}℃")
        println("Ночная температура:    ${this.nightTemp - 273}℃")
        println("Были ли осадки:        ${this.wasPrecipitation}")
        println()
    }
}