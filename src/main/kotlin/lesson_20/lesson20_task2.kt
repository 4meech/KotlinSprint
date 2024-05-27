package org.example.lesson_20

fun main() {
    val player = Player("Player", 42, 146)
    println(player.currentHealth)
    val healingPotion: (player: Player) -> Unit = {
        println("Игрок ${it.playerName} принял лечебное зелье...")
        it.currentHealth = it.maxHealth
        println("Запас здоровья полностью восстановлен!")
    }

    healingPotion(player)
    println(player.currentHealth)
}

class Player(
    val playerName: String,
    var currentHealth: Int,
    val maxHealth: Int,
)