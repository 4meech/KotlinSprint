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

class Crucian : Swimmable {
    override fun swim() {
        println("Карась может плавать")
    }
}

class Seagull : Swimmable, Flyable {
    override fun swim() {
        println("Чайка может плавать")
    }

    override fun fly() {
        println("Чайка может летать")
    }
}

class Duck : Swimmable, Flyable {
    override fun fly() {
        println("Утка может летать")
    }

    override fun swim() {
        println("Утка может плавать")
    }
}

interface Swimmable {
    fun swim()
}

interface Flyable {
    fun fly()
}