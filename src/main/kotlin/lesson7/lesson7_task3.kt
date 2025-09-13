package org.example.lesson7

fun main() {

    println("Введите число:")
    val number = readln().toInt()
    val progression: IntProgression = 0..number step 2
    for (i in progression){
        println("$i ")
    }
}