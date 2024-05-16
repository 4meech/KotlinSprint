package org.example.lesson_16

fun main() {
    val order = Order(651, "Подтверждён")

    println(order.orderStatus)
    order.changeOrderStatus()
}

private class Order(private val orderNumber: Int, var orderStatus: String) {
    private fun setNewOrderStatus(newOrderStatus: String) {
        orderStatus = newOrderStatus
    }

    fun getOrderNumber() = orderNumber

    fun changeOrderStatus() {
        println("Введите новый статус заказа: ")
        val userInput = readln()
        setNewOrderStatus(userInput)
        println("Статус $userInput к заказу ${getOrderNumber()} направлен на согласование менеджеру")
    }
}