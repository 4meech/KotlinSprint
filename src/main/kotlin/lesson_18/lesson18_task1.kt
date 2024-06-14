package org.example.lesson_18

fun main() {
    val item1 = OrderItem()
    val item2 = OrderItem()

    item1.printOrderInfo("Брюква")
    item2.printOrderInfo(listOf("Репа", "Редька"))
}

class OrderItem {

    fun printOrderInfo(
        orderItemName: String,
    ) {
        println("Заказан товар: $orderItemName")
    }

    fun printOrderInfo(
        orderItemsNames: List<String>,
    ){
        println("Заказаны следующие товары: ${orderItemsNames.joinToString(", ")}")
    }
}