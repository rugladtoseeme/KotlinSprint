package org.example.lesson11

class User2(
    val id: Int,
    val username: String,
    var password: String,
    val email: String,
    var bio: String? = null,
) {
    fun printUserInfo() = println(
        """User2: id = $id, username = $username, password = $password, 
        email = $email, bio = ${if (!bio.isNullOrBlank()) bio else "нет данных"}""".replace((Regex("\\s+")), " ")
    )

    fun setBioFromConsole() {
        println("Введите bio пользователя:")
        bio = readln()
        println("Значение bio установлено успешно.")
    }

    fun changePassword() {
        println("Введите старый пароль")
        if (readln() == password) {
            println("Введите новый пароль")
            password = readln()
            println("Успешно сменен пароль!")
        } else println("Неверный ввод пароля, доступ запрещен.")
    }
}

fun main() {
    val user = User2(id = 1, username = "user", password = "123", email = "user@mail.ru")
    user.setBioFromConsole()
    user.changePassword()
    user.printUserInfo()
}


