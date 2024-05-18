package org.example.lesson_17

fun main() {
    val mayflower = Ship("Mayflower", 20.0, "Plymouth")
    mayflower.shipName = "Speedwell"
}

class Ship(
    name: String,
    avgSpeed: Double,
    homePort: String,
) {

    var shipName = name
        get() = field
        set(value: String) {
            println("Ошибка: имя корабля не может быть изменено!")
        }
}