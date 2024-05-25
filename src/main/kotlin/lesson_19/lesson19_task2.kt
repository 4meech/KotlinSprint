package org.example.lesson_19

fun main() {
    val dress = Product("Платье", 101, Categories.CLOTHES)
    val holepuncher = Product("Дырокол", 102, Categories.STATIONERY)
    val mudGoose = Product("Гусь целебный, грязенаполненный 'Игнат'", 103, Categories.MISCELLANEOUS)

    dress.printProductInfo()
    holepuncher.printProductInfo()
    mudGoose.printProductInfo()
}

enum class Categories(private val catName: String) {
    CLOTHES("Одежда"),
    STATIONERY("Канцтовары"),
    MISCELLANEOUS("Всякое разное");

    fun showName() = catName
}


class Product(private val productName: String, private val productId: Int, private val productCateegory: Categories) {
    fun printProductInfo() {
        println("Товар: $productName\nID: $productId\nКатегория: ${productCateegory.showName()}")
        println()
    }
}
