package org.example.lesson_11

fun main() {
    val testRoom = Room(
        coverImage = "testCover.jpg",
        roomName = "Clubhouse",
    )

    val testUser = User(
        userName = "John Doe",
        userImage = "testAvatar.jpg",
    )

    testRoom.addUser(testUser)

    testUser.showUserInfo()
    testUser.updateUserStatus("John Doe", "говорит")
    testUser.showUserInfo()
}

class Room(
    val coverImage: String,
    val roomName: String,
    val userList: MutableList<User> = mutableListOf(),
) {
    fun addUser(user: User) {
        userList.add(user)
    }
}

class User(
    val userName: String,
    val userImage: String,
    var userStatus: String = "микрофон выключен",
) {
    fun showUserInfo() {
        println(this.userName)
        println(this.userStatus)
    }

    fun updateUserStatus(userName: String, userStatus: String) {
        if (this.userName == userName) {
            this.userStatus = userStatus
        } else {
            println("Ошибка ввода")
        }
    }
}