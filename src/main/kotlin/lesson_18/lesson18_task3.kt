package org.example.lesson_18

fun main() {

    val fox = Fox("Лиса", "ягоды")
    val dog = Dog("Собака", "кости")
    val cat = Cat("Кошка", "рыбов")

    val listOfAnimals: List<Animal> = listOf(fox, dog, cat)

    for (animal in listOfAnimals) {
        animal.eat()
    }
}

open class Animal(
    open val name: String,
    open val foodName: String
) {
    open fun eat() {
        println("$name ест $foodName")
    }

    open fun sleep() {
        print("$name спит")
    }
}

class Fox(name: String, foodName: String) : Animal(name, foodName)

class Dog(name: String, foodName: String) : Animal(name, foodName)

class Cat(name: String, foodName: String) : Animal(name, foodName) {
    override fun eat() {
        super.eat()
        println("Сытное")
    }
}