package org.example.lesson10

fun throwBones(): Int {
    return (1..6).random()
}

fun playRound(): Int {
    val humanPoints = throwBones()
    println("Бросок человека: выпало $humanPoints очков.")
    val computerPoints = throwBones()
    println("Бросок компьютера: выпало $computerPoints очков.")

    when {
        humanPoints < computerPoints -> {
            println("Победила машина!")
            return 0
        }

        humanPoints > computerPoints -> {
            println("Победило человечество!")
            return 1
        }

        else -> {
            println("Победила дружба!")
            return 0
        }
    }
}

fun main() {

    println("Игра начата!")
    var wins = 0
    var roundsTotal = 0

    do {
        wins += playRound()
        roundsTotal++
        println("Хотите продолжать игру? (да/нет)")
        val continueGameStr = readln()
        val continueGame = continueGameStr.equals("да", ignoreCase = true)
    } while (continueGame)

    println("Игра окончена. Выиграно $wins раундов из $roundsTotal.")
}