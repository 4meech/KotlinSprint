package org.example.lesson_19

fun main() {
    Fish.GUPPY.printFish()
}

enum class Fish(private val fishName: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок");

    fun printFish() {
        println("Вы можете добавить в аквариум:")
        entries.forEach {
            println("- ${it.fishName}")
        }
    }
}