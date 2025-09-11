package org.example.lesson6

const val MILLISECONDS_IN_SECOND = 1000L

fun main() {
    println("Введите количество секунд")
    var seconds = readln().toInt()

    while (seconds > 0) {
        println("Осталось секунд: ${seconds--}.")
        Thread.sleep(MILLISECONDS_IN_SECOND)
    }

    println("Время вышло.")
}