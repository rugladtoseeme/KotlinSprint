package org.example.lesson10

fun isStringLengthValid(str: String): Boolean = str.length >= 4

fun main() {

    println("Введите логин:")
    var login = readln()
    println("Введите пароль:")
    val password = readln()

    if (isStringLengthValid(login) && isStringLengthValid(password))
        println("Регистрация успешна!")
    else println("Внимание, слишком корткий логин или пароль! ")
}