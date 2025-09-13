package org.example.lesson7

import kotlin.random.Random

const val ASCII_CODE_A = 97
const val ASCII_CODE_Z = 122

fun main() {

    var password = ""
    for (i in 1..3) {
        password = "$password${Char(Random.nextInt(ASCII_CODE_A, ASCII_CODE_Z))}"
        password = "$password${Random.nextInt(0, 9)}"
    }
    println("сгенерирован пароль: $password")
}