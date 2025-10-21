package org.example.lesson21

class Player(val name: String, val maxHp: Int, var currentHp: Int) {
    override fun toString() = "Игрок $name, здоровье:($currentHp/$maxHp)"
}

fun Player.isHealthy() = currentHp == maxHp

fun main() {

    val useHealingPotion: (Player) -> Unit = { player: Player ->
        if (player.isHealthy()) println("Зелье лечения не использовано: Здоровье полное.")
        else {
            player.currentHp = player.maxHp
            println("Зелье лечения использовано. Здоровье восстановлено!")
        }
    }

    val player1 = Player("jean", 100, 35)
    println(player1)
    useHealingPotion(player1)
    println(player1)

    println()

    val player2 = Player("dean", 110, 110)
    println(player2)
    useHealingPotion(player2)
    println(player2)
}