package org.example.lesson_14

fun main() {
    val mars = Planet("Марс", hasAtmosphere = true, isPossibleToLand = true)

    val phobos = Satellite("Фобос", false, true).apply { mars.satelliteSet.add(this) }
    val deimos = Satellite("Деймос", false, false).apply { mars.satelliteSet.add(this) }

    mars.run {
        println("Планета $name")
        println("Список спутников:")
        satelliteSet.forEach {
            println("— ${it.name}")
        }
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