package org.example.lesson6

const val MAX_NUMBER = 9
const val MIN_NUMBER = 1
const val MAX_TRIES = 5

fun enterNumber(): Int {
    println("Введи число от 1 до 9")
    return readln().toInt()
}

fun main() {

    val secretNumber = (MIN_NUMBER.. MAX_NUMBER).random()
    var counter = 0

    while (counter < MAX_TRIES) {

        if (enterNumber() == secretNumber) {
            println("Поздравляем! Вы угадали зададанное число!")
            return
        } else println("Неверно! Осталось попыток: ${MAX_TRIES - ++counter}")
    }

    println("Попытки закончились. Правильный ответ был: $secretNumber")
}