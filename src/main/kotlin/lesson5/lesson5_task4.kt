package org.example.lesson5

fun main() {

    val registredUsername = "Zaphod"
    val registredUserPassword = "PanGalactic"

    println("Пожалуйста, вводите свои данные...")
    println("Введите имя пользователя:")

    val inputUsername = readln()

    if (inputUsername == registredUsername) {
        println("Введите пароль:")
        val inputPassword = readln()
        if (inputPassword == registredUserPassword)
            println("Добро пожаловать!")
        else println("Неверный пароль!")
    } else println("Пользователь с данным именем не найден. Зарегистрируйтесь.")


}