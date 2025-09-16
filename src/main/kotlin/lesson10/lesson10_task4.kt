package org.example.lesson10

fun throwBones(): Int {
    return (1..6).random()
}

fun playRound(): Boolean {
    val humanPoints = throwBones()
    println("Бросок человека: выпало $humanPoints очков.")
    val computerPoints = throwBones()
    println("Бросок компьютера: выпало $computerPoints очков.")

    when {
        humanPoints < computerPoints -> {
            println("Победила машина!")
            return false
        }

        humanPoints > computerPoints -> {
            println("Победило человечество!")
            return true
        }

        else -> {
            println("Победила дружба!")
            return false
        }
    }
}

fun main() {

    println("Игра начата!")
    var wins = 0
    var roundsTotal = 0

    do {
        wins += if (playRound()) 1 else 0
        roundsTotal++
        println("Хотите продолжать игру? (да/нет)")
        val continueGameStr = readln()
        val continueGame = continueGameStr.equals("да", ignoreCase = true)
    } while (continueGame)

    println("Игра окончена. Выиграно $wins раундов из $roundsTotal.")
}