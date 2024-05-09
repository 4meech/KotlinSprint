package org.example.lesson_13

fun main() {
    val user = Subscriber2("John Doe", 88005553535)

    user.printSubscriberInfo()
}

class Subscriber2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printSubscriberInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}")
    }
}