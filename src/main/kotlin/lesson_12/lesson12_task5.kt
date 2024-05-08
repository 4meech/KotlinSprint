package org.example.lesson_12

import kotlin.random.Random

const val DAYS_TOTAL = 30

fun main() {

    val weatherList: MutableList<Wthr> = mutableListOf()
    val precipitationDayList: MutableList<Wthr> = mutableListOf()
    val dayTempList = mutableListOf<Int>()
    val nightTempList = mutableListOf<Int>()

    var dayNumber = 1

    while (weatherList.size < DAYS_TOTAL) {

        val dayTemp = (22..35).random()
        val nightTemp = (13..20).random()
        val wasPrecipitation = Random.nextBoolean()
        val obj = Wthr(dayTemp, nightTemp, wasPrecipitation, "День $dayNumber")
        dayTempList.add(dayTemp)
        nightTempList.add(nightTemp)
        if (wasPrecipitation) precipitationDayList.add(obj)
        weatherList.add(obj)
        dayNumber++
    }
    println(
        """
        ————————————————————————————————————————————
        Средняя дневная температура за ${dayNumber - 1} дн: ${"%.1f".format(dayTempList.average())}℃
        Средняя ночная температура за ${dayNumber - 1} дн: ${"%.1f".format(nightTempList.average())}℃
        Количество дней с осадками: ${precipitationDayList.size}
    """.trimIndent()
    )
}

class Wthr(
    dayTemp: Int,
    nightTemp: Int,
    wasPrecipitation: Boolean,
    name: String,
) {
    init {
        val precipitation = if (wasPrecipitation) "да" else "нет"
        println("$name. Днём $dayTemp℃, ночью $nightTemp℃, осадки: $precipitation")
    }
}