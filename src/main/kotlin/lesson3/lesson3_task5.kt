package org.example.lesson3

fun main(){

    val chessTurnString = "D2-D4;0"

    val chessPositionFrom = chessTurnString.substringBefore('-')
    val chessPositionTo = chessTurnString.substringBefore(';').substringAfter('-')
    val chessTurnNumber = chessTurnString.substringAfter(';')

    println(chessPositionFrom)
    println(chessPositionTo)
    println(chessTurnNumber)
}