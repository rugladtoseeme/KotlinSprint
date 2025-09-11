package org.example.lesson6

fun main() {

    println("Введите количество секунд")
    val seconds = readln().toInt()
    var counter = seconds

    while(counter > 0) {
        counter--
        Thread.sleep(1000)
    }

    println("Прошло $seconds секунд")
}