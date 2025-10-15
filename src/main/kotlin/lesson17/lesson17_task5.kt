package org.example.lesson17

class User(username: String, password: String) {

    var userName: String = username
        set(value) {
            field = value
            println("Логин успешно сменен.")
        }

    var password: String = password
        set(value) {
            println("Нельзя сменить пароль!")
        }
        get() = field.replace(Regex("."), "*")
}

fun main() {
    val user = User("user1", "11111")
    user.userName = "user11"
    user.password = "222"
    println("Пользователь ${user.userName}, его пароль: ${user.password}")
}