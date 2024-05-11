package org.example.lesson_15

const val TEMPETARURE = 23.4
const val PRECIPITATION_AMOUNT = 8.6

fun main() {
    val tempNow = Temperature(dataValue = TEMPETARURE)
    val precipitationNow = PrecipitationAmount(dataValue = PRECIPITATION_AMOUNT)

    val sender = WeatherServer()
    sender.sendWeatherData(tempNow, null)
    sender.sendWeatherData(tempNow, precipitationNow)
    sender.sendWeatherData(null, precipitationNow)
    sender.sendWeatherData(null, null)
}

abstract class WeatherStationStats {
    abstract val dataType: String
    abstract val dataValue: Double
}

class Temperature(
    override val dataType: String = "Температура",
    override val dataValue: Double
) : WeatherStationStats()

class PrecipitationAmount(
    override val dataType: String = "Количество осадков",
    override val dataValue: Double
) : WeatherStationStats()


class WeatherServer {
    fun sendWeatherData(tempData: WeatherStationStats? = null, precipitationData: WeatherStationStats? = null) {
        println("Данные для отправки на сервер:")
        if (tempData != null && precipitationData != null) {
            println("${tempData.dataType}:           ${tempData.dataValue} ℃")
            println("${precipitationData.dataType}:    ${precipitationData.dataValue} мм.")
        } else if (tempData != null && precipitationData == null) {
            println("${tempData.dataType}:           ${tempData.dataValue} ℃")
        } else if (tempData == null && precipitationData != null) {
            println("${precipitationData.dataType}:    ${precipitationData.dataValue} мм.")
        } else {
            println("-отсутствуют-")
        }
        println()
    }
}