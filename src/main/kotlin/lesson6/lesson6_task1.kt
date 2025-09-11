package org.example.lesson6

fun main() {

    println("Авторизация.")
    println("Придумайте логин:")
    val login = readln()
    println("Придумайте надежный пароль:")
    val password = readln()
    println("Пользователь успешно зарегистрирован!\n")

    println("Вход.")
    do {
        println("Введите ваш логин:")
        val enteredLogin = readln()
        println("Введите ваш пароль:")
        val enteredPassword = readln()
        val isLoginOrPwdWrong = enteredLogin != login || enteredPassword != password
        if (isLoginOrPwdWrong)
            println("Неверный логин или пароль! Попробуйте ввести еще раз.")
    } while (isLoginOrPwdWrong)

    println("Вход успешен. Добро пожаловать в приложение!")

}