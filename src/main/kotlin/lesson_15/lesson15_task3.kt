package org.example.lesson_15

fun main() {
    val user = ForumUser("Юзер")
    val admin = ForumAdmin("Админ")

    user.readForum()
    user.writeMessage("Админ петух!")

    admin.readForum()
    user.message?.let { admin.deleteMessage(it) }
    admin.deleteUser(user)
}

abstract class GlobalUser {
    abstract val userName: String
    fun readForum() {
        println("$userName читает форум...")
    }

    abstract fun writeMessage(messageText: String)
}


class ForumUser(
    override val userName: String = ""
) : GlobalUser() {
    var message: Message? = null
    override fun writeMessage(messageText: String) {
        val newMessage = Message(userName, messageText)
        message = newMessage
    }
}

class ForumAdmin(
    override val userName: String = ""
) : GlobalUser() {
    override fun writeMessage(messageText: String) {}

    fun deleteUser(userName: ForumUser) {
        println("Пользователь ${userName.userName} забанен!")
    }

    fun deleteMessage(message: Message) {
        println("Сообщение '${message.messageText}' удалено")
    }
}

class Message(userName: String, val messageText: String) {
    init {
        println("Новое сообщение от пользователя '$userName':")
        println(messageText)
    }
}