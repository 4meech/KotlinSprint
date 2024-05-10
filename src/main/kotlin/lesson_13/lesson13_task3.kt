package org.example.lesson_13

fun main() {
    val contactsList = listOf(
        Subscriber3("John Doe", 88005553535, "null"),
        Subscriber3("Jane Doe", 88005553536, null),
        Subscriber3("Alice Doe", 88005553537, null),
        Subscriber3("Bob Doe", 88005553538),
        Subscriber3("Douglas Doe", 88005553539),
    )

    val companyList = contactsList.mapNotNull { it.company }
    println("Список компаний: \n${companyList.toSortedSet()}")
}

class Subscriber3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
)