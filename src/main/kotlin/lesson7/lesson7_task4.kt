package org.example.lesson7

private const val MILLISECONDS_IN_SECOND = 1000L
fun main() {

    println("Введите количество секунд таймера:")
    val seconds = readln().toInt()
    for (i in seconds downTo 1) {
        println("Осталось $i секунд.")
        Thread.sleep(MILLISECONDS_IN_SECOND)
    }
    println("Время вышло!")
}