package org.example.lesson7

const val MIN_PASSWORD_LENGTH = 6

val rangeDigits: CharRange = '0'..'9'
val rangeLowChars: CharRange = 'a'..'z'
val rangeUpperChars: CharRange = 'A'..'Z'

fun generateRandomChar(): Char {
    val typeOfNextChar = (0..2).random()
    return when (typeOfNextChar) {
        0 -> rangeDigits.random()
        1 -> rangeLowChars.random()
        else -> rangeUpperChars.random()
    }
}

fun main() {

    println("Введите длину пароля (не менее $MIN_PASSWORD_LENGTH символов):")
    var passwordLength = readln().toInt()
    while (passwordLength <= MIN_PASSWORD_LENGTH) {
        println("Длина пароля должна быть более 6 символов, введите значение снова:")
        passwordLength = readln().toInt()
    }

    var password = ""
    for (i in 0..passwordLength - 2) {
        password += generateRandomChar()
    }

    if (!password.any { it.isDigit() }) {
        password += (rangeDigits).random()
    }
    if (!password.any { it.isLowerCase() }) {
        password += (rangeLowChars).random()
    }
    if (!password.any { it.isUpperCase() }) {
        password += (rangeUpperChars).random()
    }

    for (i in password.length..passwordLength) {
        password += generateRandomChar()
    }

    println(password)
}