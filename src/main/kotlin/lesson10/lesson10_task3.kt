package org.example.lesson10

fun generatePassword(pwdLength: Int): String {
    var password = ""
    val digitsRange = '0'..'9'
    val charsSequence = "!\"#$%&'()*+,-./ "
    for (i in 0..pwdLength) {
        if (i % 2 == 0) password += digitsRange.random()
        else password += charsSequence.random()
    }
    return password
}

fun main() {
    println("Введите длину пароля")
    println(generatePassword(readln().toInt()))
}