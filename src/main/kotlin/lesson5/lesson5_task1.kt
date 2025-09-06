package org.example.lesson5

fun main() {

    val number1 = 3
    val number2 = 5

    val sumReal = number1 + number2

    println("$number1 + $number2 = ?")
    val sumInput = readln().toInt()

    if (sumInput == sumReal)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")

}