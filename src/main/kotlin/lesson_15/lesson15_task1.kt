package org.example.lesson_15

fun main() {
    val crucian = Crucian()
    val seagull = Seagull()
    val duck = Duck()

    crucian.swim()
    seagull.swim()
    seagull.fly()
    duck.swim()
    duck.fly()
}

abstract class Fish(
    val fishTypeName: String = "Рыба",
)

abstract class Bird(
    val birdTypeName: String = "Птица"
)

class Crucian : Fish(), Swimmable {
    override fun swim() {
        println("${this.fishTypeName} 'Карась' может плавать")
    }
}

class Seagull : Bird(), Swimmable, Flyable {
    override fun swim() {
        println("${this.birdTypeName} 'Чайка' может плавать")
    }

    override fun fly() {
        println("${this.birdTypeName} 'Чайка' может летать")
    }
}

class Duck : Bird(), Swimmable, Flyable {
    override fun fly() {
        println("${this.birdTypeName} 'Утка' может летать")
    }

    override fun swim() {
        println("${this.birdTypeName} 'Утка' может плавать")
    }
}

interface Swimmable {
    fun swim()
}

interface Flyable {
    fun fly()
}