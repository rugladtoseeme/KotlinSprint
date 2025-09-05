package org.example.lesson3

fun main() {

    var chessPositionFrom = "E2"
    var chessPositionTo = "E4"
    var chessTurnNumber = 0

    println("$chessPositionFrom-$chessPositionTo;$chessTurnNumber")

    chessPositionFrom = "D2"
    chessPositionTo = "D3"
    chessTurnNumber++

    println("$chessPositionFrom-$chessPositionTo;$chessTurnNumber")
}