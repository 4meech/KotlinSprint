package org.example

fun main() {
    // Предполагается, что число заказов не перевалит за 127
    // Такой вот маленький магазинчик. В противном случае используем Short/Int

    val numberOfOrders: Byte = 75
    val thanksMessage: String = "Благодарим за покупку в нашем интернет-магазине!"
    println(numberOfOrders)
    println(thanksMessage)

    // Предполагается, что количество работников не превысит 32,767
    var numberOfEmployees: Short = 2000
    // println(numberOfEmployees)
    // Один работник уволился
    numberOfEmployees = 1999

    println(numberOfEmployees)
}