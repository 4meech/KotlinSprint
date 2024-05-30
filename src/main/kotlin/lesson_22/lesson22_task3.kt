package org.example.lesson_22

fun main() {
    val person = Person("John", "male", 33)
    val (name, sex, age) = person

    println(name)
    println(sex)
    println(age)
}

data class Person(val name: String, val sex: String, val age: Int)