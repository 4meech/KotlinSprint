package org.example.lesson_21

fun main() {
    val player = Player3("Player 3", 146, 146)
    print(player.isHealthy())
}

fun Player3.isHealthy(): Boolean = (currentHealth == maxHealth)

class Player3(
    val playerName: String,
    var currentHealth: Int,
    val maxHealth: Int,
)