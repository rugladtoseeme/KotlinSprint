package org.example.lesson6

private const val MILLISECONDS_IN_SECOND = 1000L

fun main() {

    println("Введите количество секунд")
    val seconds = readln().toInt()
    Thread.sleep(MILLISECONDS_IN_SECOND * seconds)
    println("Прошло $seconds секунд")
}