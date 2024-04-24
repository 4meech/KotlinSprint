package org.example.lesson_3

fun main() {
    // у нас государственное приложение. Именуем людей сухим словом "субъект"
    var subjectSurname = "Андреева"
    val subjectName = "Татьяна"
    val subjectPatronym = "Сергеевна"
    var subjectAge = 20

    println("$subjectSurname $subjectName $subjectPatronym, $subjectAge")

    // раз приложение отслеживает, то пусть и хранит данные
    val subjectFullMaidenName = "$subjectSurname $subjectName $subjectPatronym"
    subjectSurname = "Сидорова"
    subjectAge += 2 // Почему бы и нет?
    println("$subjectSurname $subjectName $subjectPatronym, $subjectAge")
}