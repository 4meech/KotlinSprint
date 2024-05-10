package org.example.lesson_14

fun main() {
    val mars = Planet("Марс", hasAtmosphere = true, isPossibleToLand = true)

    val phobos = Satellite("Фобос", hasAtmosphere = false, isPossibleToLand = true)
    val deimos = Satellite("Деймос", hasAtmosphere = false, isPossibleToLand = false)

    mars.satelliteSet.addAll(setOf(phobos, deimos))

    println("Планета ${mars.name}")
    println("Список спутников:")
    mars.satelliteSet.forEach { satellite ->
        println("— ${satellite.name}")
    }
}

abstract class Celestial {
    abstract val hasAtmosphere: Boolean
    abstract val isPossibleToLand: Boolean
}

class Planet(
    val name: String,
    override val hasAtmosphere: Boolean,
    override val isPossibleToLand: Boolean,
) : Celestial() {
    val satelliteSet = mutableSetOf<Satellite>()
}

class Satellite(
    val name: String,
    override val hasAtmosphere: Boolean,
    override val isPossibleToLand: Boolean,
) : Celestial()