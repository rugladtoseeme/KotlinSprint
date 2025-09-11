package org.example.lesson6

import kotlin.random.Random

const val MAX_NUMBER = 9
const val MAX_TRIES = 3

fun generateTest(): Int {
    val number1 = Random.nextInt(1, MAX_NUMBER)
    val number2 = Random.nextInt(1, MAX_NUMBER)
    println("Решите пример: $number1 + $number2 = ?")
    return number1 + number2
}

fun main() {

    println("Докажите, что вы не робот.")
    var counter = 0
    while (counter < MAX_TRIES) {
        if (generateTest() != readln().toInt()) println("Ответ неверный!")
        else {
            println("Проверка пройдена, добро пожаловать в приложение!")
            return
        }
        counter++
    }
    println("Доступ запрещен.")
}