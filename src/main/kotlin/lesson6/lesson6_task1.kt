package org.example.lesson6

fun main() {

    println("Авторизация.")
    println("Придумайте логин:")
    val login = readln()
    println("Придумайте надежный пароль:")
    val password = readln()
    println("Пользователь успешно зарегистрирован!\n")

    println("Вход.")
    println("Введите ваш логин:")
    var enteredLogin = readln()
    println("Введите ваш пароль:")
    var enteredPassword = readln()

    while (enteredLogin != login || enteredPassword != password) {
        println("Неверный логин или пароль! Попробуйте снова:")
        println("Введите ваш логин:")
        enteredLogin = readln()
        println("Введите ваш пароль:")
        enteredPassword = readln()
    }

    println("Вход успешен. Добро пожаловать в приложение!")

}