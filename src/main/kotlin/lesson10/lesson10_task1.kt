package org.example.lesson10

fun throwBones(): Int {
    return (1..6).random()
}

fun main() {

    println("Игра начата!")
    val humanPoints = throwBones()
    println("Бросок человека: выпало $humanPoints очков.")
    val computerPoints = throwBones()
    println("Бросок компьютера: выпало $computerPoints очков.")

    when {
        humanPoints < computerPoints -> println("Победила машина!")
        humanPoints > computerPoints -> println("Победило человечество!")
        else -> println("Победила дружба!")
    }

}