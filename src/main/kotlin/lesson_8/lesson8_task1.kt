package org.example.lesson_8

fun main() {
    val viewsArray = IntArray(7) { (0..999).random() }

    print("Всего просмотров рекламы за неделю: ${viewsArray.sum()}")
}