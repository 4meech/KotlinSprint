package org.example.lesson_4

const val MAX_AVERAGE_WEIGHT = 100
const val MIN_AVERAGE_WEIGHT = 35
const val MAX_AVERAGE_VOLUME = 100

fun main() {
    var cargoWeight = 20
    var cargoVolume = 80
    // как правильно переносить длинную строку кода в соттветствии с Code Conventions?
    println("Груз с весом $cargoWeight и объёмом $cargoVolume соответствует категории 'Average': ${
        (cargoWeight >= MIN_AVERAGE_WEIGHT && cargoWeight <= MAX_AVERAGE_WEIGHT) 
        && (cargoVolume < MAX_AVERAGE_VOLUME)}")

    cargoWeight = 50
    cargoVolume = 120
    println("Груз с весом $cargoWeight и объёмом $cargoVolume соответствует категории 'Average': ${
        ((cargoWeight >= MIN_AVERAGE_WEIGHT) and (cargoWeight <= MAX_AVERAGE_WEIGHT)) 
        and (cargoVolume < MAX_AVERAGE_VOLUME)}")
}