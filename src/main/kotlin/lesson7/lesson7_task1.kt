package org.example.lesson7

fun main() {

    var password = ""
    for (i in 1..3) {
        password = "$password${('a'..'z').random()}"
        password = "$password${(0..9).random()}"
    }
    println("сгенерирован пароль: $password")
}