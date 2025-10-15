package org.example.lesson18

abstract class Dice(val numberOfFaces: Int) {
    abstract fun throwDice()
}

class FourFacedDice : Dice(numberOfFaces = 4) {
    override fun throwDice() {
        println("На четырехграннике выпало ${(1..numberOfFaces).random()} очков.")
    }
}

class SixFacedDice : Dice(numberOfFaces = 6) {
    override fun throwDice() {
        println("На шестиграннике выпало ${(1..numberOfFaces).random()} очков.")
    }
}

class EightFacedDice : Dice(numberOfFaces = 8) {
    override fun throwDice() {
        println("На восьмиграннике выпало ${(1..numberOfFaces).random()} очков.")
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