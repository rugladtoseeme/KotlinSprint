package org.example.lesson10

fun generatePassword(pwdLength: Int): String {
    var password = ""
    for (i in 0..pwdLength) {
        if (i % 2 == 0) password += (0..9).random()
        else password += ("!\"#$%&'()*+,-./ ").random()
    }
    return password
}

fun main() {
    println("Введите длину пароля")
    println(generatePassword(readln().toInt()))
}