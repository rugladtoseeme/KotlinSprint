package org.example.lesson16

private const val USER_PASSWORD = "1111"
private const val USER_USERNAME = "user"

class User(val username: String, private val password: String) {

    fun validatePassword(newPassword: String) = newPassword == password
}

fun main() {
    val user = User(username = USER_USERNAME, password = USER_PASSWORD)
    println("введите пароль пользователя:")
    if (user.validatePassword(readln())) println("верный пароль!")
    else println("пароль неверный.")
}