package org.example.lesson_11

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("John Doe")
    val user2 = forum.createNewUser("Jane Doe")

    forum.createNewMessage(user1.userId, "Sample text")
    forum.createNewMessage(user1.userId, "Yet another sample text")
    forum.createNewMessage(user2.userId, "Text sample")
    forum.createNewMessage(user2.userId, "Yet another text sample")

    forum.printThread()
}

class Forum {
    private val users = mutableListOf<ForumUser>()
    private val messages = mutableListOf<Message>()

    fun createNewUser(userName: String): ForumUser {
        val createdUser = ForumUser((1001..9999).random(), userName)

        users.add(createdUser)
        return createdUser
    }

    fun createNewMessage(userId: Int, messageText: String) {
        if (users.any { it.userId == userId }) {
            val createdMessage = Message(userId, messageText)
            messages.add(createdMessage)
        } else {
            println("Такого пользователя не существует!")
        }
    }

    fun printThread() {
        messages.forEach {
            println("${it.authorId}: ${it.message}")
        }
    }
}

class ForumUser(val userId: Int, val userName: String)

class Message(val authorId: Int, val message: String)
