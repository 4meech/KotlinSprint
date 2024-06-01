package org.example.lesson_11

const val USERS_STARTCOUNT = 1000

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
    private var userCounter = USERS_STARTCOUNT

    fun createNewUser(userName: String): ForumUser {
        val createdUser = ForumUser(++userCounter, userName)

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
        messages.forEach { message ->
            val authorName = users.find { it.userId == message.authorId }
            println("${authorName?.userName}: ${message.message}")
        }
    }
}

class ForumUser(val userId: Int, val userName: String)

class Message(val authorId: Int, val message: String)