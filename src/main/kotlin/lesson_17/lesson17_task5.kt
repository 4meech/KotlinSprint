package org.example.lesson_17

fun main() {
    val user = User17("John Doe IV", "qweqwe789")

    println(user.password)
    user.password = "321654987"
    user.login = "Johnh Doe V"
    println(user.login)
}

class User17(userName: String, userPass: String) {

    var password = userPass
        get() {
            return CharArray(field.length) { '*' }.joinToString("")
        }
        set(value) {
            println("Вы не можете изменить пароль")
        }

    var login = userName
        set(value) {
            field = value
            println("Логин успешно изменён")
        }
}