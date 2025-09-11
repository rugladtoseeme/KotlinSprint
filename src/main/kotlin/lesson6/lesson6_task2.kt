package org.example.lesson6

const val MILLISECONDS_IN_SECOND = 1000L

fun main() {

    println("Введите количество секунд")
    val seconds = readln().toInt()
    var counter = seconds

    while (counter > 0) {
        counter--
        Thread.sleep(MILLISECONDS_IN_SECOND)
    }

    println("Прошло $seconds секунд")
}