package org.example.lesson_14

const val VESSEL_CAPACITY_1 = 3547
const val VESSEL_SPEED_1 = 23
const val VESSEL_DISPLACEMENT_1 = 52310
const val FREIGHTER_SPEED_1 = 14
const val FREIGHTER_DISPLACEMENT_1 = 217612
const val ICEBREAKER_SPEED_1 = 10
const val ICEBREAKER_CAPACITY_1 = 80

fun main() {
    val titanic = Liner1()
    val everGiven = Freighter1()
    val krasin = Icebreaker1()

    titanic.printInfo()
    titanic.cargoType()

    everGiven.printInfo()
    everGiven.cargoType()

    krasin.printInfo()
    krasin.cargoType()
}

open class Liner1(
    val vesselCapacity: Int = VESSEL_CAPACITY_1,
    val vesselSpeed: Int = VESSEL_SPEED_1,
    val vesselDisplacement: Int = VESSEL_DISPLACEMENT_1,
) {
    open fun cargoType() {
        println()
        println(
            """
            Метод загрузки:
            горизонтальный трап
        """.trimIndent()
        )
    }

    open fun printInfo() {
        println(
            """
             ——————————————————————————————————————
             Судно относится к классу '${javaClass.simpleName}'
             Вместимость:       $vesselCapacity чел.
             Скорость:          $vesselSpeed уз.
             Грузоподъёмность:  $vesselDisplacement т.
         """.trimIndent()
        )
    }

}

class Freighter1(
    vesselCapacity: Int = VESSEL_CAPACITY_1,
    vesselSpeed: Int = FREIGHTER_SPEED_1,
    vesselDisplacement: Int = FREIGHTER_DISPLACEMENT_1,
) : Liner1(vesselCapacity, vesselSpeed, vesselDisplacement) {
    override fun cargoType() {
        println()
        println(
            """
            Метод загрузки:
            погрузочный кран
        """.trimIndent()
        )
    }
}

class Icebreaker1(
    vesselCapacity: Int = ICEBREAKER_CAPACITY_1,
    vesselSpeed: Int = ICEBREAKER_SPEED_1,
    vesselDisplacement: Int = VESSEL_DISPLACEMENT_1,
    val isIceCrushing: Boolean = true,
) : Liner1(vesselCapacity, vesselSpeed, vesselDisplacement) {
    override fun cargoType() {
        println()
        println(
            """
            Метод загрузки:
            кормовые ворота
        """.trimIndent()
        )
    }

    override fun printInfo() {
        super.printInfo()
        println("Умеет ледоколить:  $isIceCrushing")
    }
}