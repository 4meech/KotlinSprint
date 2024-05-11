package org.example.lesson_13

fun main() {
    val contactsList = mutableSetOf<Subscriber4>()

    do {
        var userDecision = ""

        println("Введите имя:")
        val userInputName = readlnOrNull() ?: ""
        println("Введите номер телефона без '+': ")
        val userInputPhone = readln().toLongOrNull()

        if (userInputPhone == null) {
            println("Ошибка ввода!")
            continue
        }

        println("Введите компанию: ")
        val userInputCompany = readlnOrNull()
        val companyName = userInputCompany.takeIf { !it.isNullOrBlank() }

        val obj = Subscriber4(userInputName, userInputPhone, companyName)
        contactsList.add(obj)

        println("Добавить ещё? Да/Нет")
        userDecision = readlnOrNull() ?: "нет"
    } while (!userDecision.equals("нет", ignoreCase = true))

    contactsList.forEach { contact ->
        contact.printContacts() }
}

class Subscriber4(
    private val name: String,
    private val phoneNumber: Long,
    private val company: String? = null,
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