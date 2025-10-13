package org.example.lesson18

abstract class Dice {
    abstract fun throwDice()
}

class FourFacedDice : Dice() {
    override fun throwDice() {
        println("На четырехграннике выпало ${(1..4).random()} очков.")
    }
}

class SixFacedDice : Dice() {
    override fun throwDice() {
        println("На шестиграннике выпало ${(1..6).random()} очков.")
    }
}

class EightFacedDice : Dice() {
    override fun throwDice() {
        println("На восьмиграннике выпало ${(1..8).random()} очков.")
    }
}

fun main() {
    val dices = listOf<Dice>(
        EightFacedDice(),
        FourFacedDice(),
        SixFacedDice(),
        EightFacedDice(),
        SixFacedDice(),
        FourFacedDice(),
        FourFacedDice(),
    )

    for (dice in dices) {
        dice.throwDice()
    }
}