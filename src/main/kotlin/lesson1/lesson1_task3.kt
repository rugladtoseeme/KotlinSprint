package org.example.lesson1

fun main() {

    val year = 1961
    var hour = 9
    var minute = 7

    println(year)
    println(hour.toString().padStart(2, '0'))
    println(minute.toString().padStart(2, '0'))

    hour = 10
    minute = 55


    println("$hour:$minute")

}
