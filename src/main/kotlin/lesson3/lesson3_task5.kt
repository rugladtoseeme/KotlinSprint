package org.example.lesson3

fun main() {

    val chessTurnString = "D2-D4;0"

    val chessTurnStringSplitted = chessTurnString.split("-", ";")
    val chessPositionFrom = chessTurnStringSplitted[0]
    val chessPositionTo = chessTurnStringSplitted[1]
    val chessTurnNumber = chessTurnStringSplitted[2]

    println(chessPositionFrom)
    println(chessPositionTo)
    println(chessTurnNumber)
}