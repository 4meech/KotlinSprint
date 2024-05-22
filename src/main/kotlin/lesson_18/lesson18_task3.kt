package org.example.lesson_18

fun main() {

    val fox = Fox("Лиса")
    val dog = Dog("Собака")
    val cat = Cat("Кошка")

    val listOfAnimals: List<Animal> = listOf(fox, dog, cat)

    for (animal in listOfAnimals) {
        animal.eat()
    }
}

open class Animal(open val name: String) {
    open fun eat() {
        println("$name ест всё подряд")
    }
}

class Fox(override val name: String) : Animal(name) {
    override fun eat() {
        println("$name ест ягоды")
    }
}

class Dog(override val name: String) : Animal(name) {
    override fun eat() {
        println("$name ест кости")
    }
}

class Cat(override val name: String) : Animal(name) {
    override fun eat() {
        println("$name ест рыбу")
    }
}