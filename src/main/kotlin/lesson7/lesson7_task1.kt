package org.example.lesson7

fun main() {

    var password = ""
    val rangeLetters = 'a'..'z'
    val rangeNumbers = '0'..'9'
    for (i in 1..3) {
        password += rangeLetters.random()
        password += rangeNumbers.random()
    }
    println("сгенерирован пароль: $password")
}