package org.example.lesson7

import kotlin.random.Random

const val ASCII_CODE_A = 97
const val ASCII_CODE_Z = 122

fun main() {

    var password = ""
    for (i in 1..3) {
        password = "$password${Char((ASCII_CODE_A.. ASCII_CODE_Z).random())}"
        password = "$password${(0..9).random()}"
    }
    println("сгенерирован пароль: $password")
}