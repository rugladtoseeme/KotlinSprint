package org.example.lesson20

class Player(){
    var hasKey = false
}

fun main() {
    val player1 = Player()
    player1.hasKey = true

    val player2 = Player()

    val openDoor: (Player) -> String =
        {
            if (it.hasKey) "Игрок открыл дверь."
            else "Дверь заперта."
        }

    println(openDoor(player1))
    println(openDoor(player2))
}