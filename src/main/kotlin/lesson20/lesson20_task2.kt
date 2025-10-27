package org.example.lesson20

class Player(val name: String, val maxHp: Int, var currentHp: Int) {
    override fun toString() = "Игрок $name, здоровье:($currentHp/$maxHp)"
}

fun main() {

    val player1 = Player("jean", 100, 35)
    println(player1)

    val useHealingPotion: (Player) -> Unit = { player: Player ->
        player.currentHp = player.maxHp
        println("Здоровье восстановлено!")
    }

    useHealingPotion(player1)
    println(player1)
}