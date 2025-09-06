package org.example.lesson5

import kotlin.random.Random

fun main() {

    val number1 = Random.nextInt(10)
    val number2 = Random.nextInt(10)

    println("$number1 + $number2 = ?")
    val answer = readln().toInt()

    if (answer == number1 + number2)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")
}