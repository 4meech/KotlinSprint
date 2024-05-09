package org.example.lesson_13

fun main() {
    val contactsList = mutableSetOf<Subscriber4>()

    do {
        println("Введите имя:")
        val userInputName = readlnOrNull() ?: ""
        println("Введите номер телефона без '+': ")
        val userInputPhone = readln().toLongOrNull()

        if (userInputPhone == null) {
            println("Ошибка ввода!")
            return
        } else {
            println("Введите компанию: ")
        }

        val userInputCompany = readlnOrNull()

        val companyName = if (userInputCompany.isNullOrBlank()) {
            null
        } else userInputCompany

        val obj = Subscriber4(userInputName, userInputPhone, companyName)
        if (contactsList.contains(obj)) {
            println("Такая запись уже существует")
        } else {
            contactsList.add(obj)
        }

        println("Добавить ещё? Да/Нет")
        val userDecision = readlnOrNull()?.lowercase() ?: "нет"
    } while (userDecision != "нет")

    contactsList.forEach { it.printContacts() }
}

class Subscriber4(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printContacts() {
        println("""
            Имя: $name
            Номер телефона: $phoneNumber
            Компания: $company
        """.trimIndent())
        println()
    }
}