package org.example.lesson_20

fun main() {
    val player2 = Player2("Doomguy", true)
    val player3 = Player2("Doom slayer", false)
    val checkIfPlayerHasKey: (Player2) -> Unit = {
        if (it.hasKey) println("${it.playerName} открыл дверь")
        else println("Дверь заперта, нужен ключ")
    }

    checkIfPlayerHasKey(player2)
    checkIfPlayerHasKey(player3)
}

private class Player2(
    val playerName: String,
    val hasKey: Boolean,
)