package org.example.lesson16

class Player(val name: String, private var hp: Int, var damage: Int) {

    private var isAlive = true

    fun takeDamage(damage: Int) {
        if (!isAlive) println("Игрок $name не может атаковать, он умер.")
        else {
            hp -= damage
            println("Игрок $name потерял $damage hp, текущее hp = $hp")
            if (hp <= 0) {
                die()
            }
        }
    }

    fun heal(hp: Int) {

        if (!isAlive) println("Игрок $name не может лечиться, он умер.")
        else {
            this.hp += hp
            println("Игрок $name использовал лечение на $hp hp, текущее hp = ${this.hp}")
        }
    }

    private fun die() {

        isAlive = false
        hp = 0
        damage = 0
        println("Игрок $name погиб...")
    }
}

fun main() {

    val player = Player("peter", 100, 20)

    player.takeDamage(30)
    player.heal(20)
    player.takeDamage(35)
    player.heal(45)
    player.takeDamage(60)
    player.heal(10)
    player.takeDamage(55)

    player.heal(20)
}