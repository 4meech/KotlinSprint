package org.example.lesson_22

fun main() {
    val regularBook1 = RegularBook("Yet Another Regular Book", "Daria Dontsova")
    val regularBook2 = RegularBook("Yet Another Regular Book", "Daria Dontsova")
    val dataBook1 = DataBook("Yet Another Data Book", "Dontsova Daria")
    val dataBook2 = DataBook("Yet Another Data Book", "Dontsova Daria")

    println(regularBook1 == regularBook2) // false, т.к. сравниваются ссылки на объекты, а ссылки разные
    println(dataBook1 == dataBook2) // true, т.к. сравниваются значения полей экземпляра объекта data class
}

class RegularBook(regularBookName: String, regularBookAuthor: String)
data class DataBook(val dataBookName: String, val dataBookAuthor: String)
