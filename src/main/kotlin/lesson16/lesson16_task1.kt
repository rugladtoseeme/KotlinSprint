package org.example.lesson16

class Dice {
    private val diceValue = (1..6).random()

    fun getDiceValue() = diceValue
}

fun main() {
    val dice = Dice()
    println("На кубике выпало ${dice.getDiceValue()} очков")
}