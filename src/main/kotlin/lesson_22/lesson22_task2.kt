package org.example.lesson_22

fun main() {
    val regularBook = RegularBook2("Yet Another Regular Book", "Daria Dontsova")
    val dataBook = DataBook2("Yet Another Data Book", "Dontsova Daria")

    println(regularBook.toString()) // выводится идентификатор объекта, унаследованного от Any
    println(dataBook) // в data class метод toString() уже переопределён -> улучшена читаемость вывода полей объекта
}

class RegularBook2(regularBookName: String, regularBookAuthor: String)
data class DataBook2(val dataBookName: String, val dataBookAuthor: String)
