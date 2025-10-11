package org.example.lesson17

class User(username: String, password: String) {

    var username: String = username
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
    user.username = "user11"
    user.password = "222"
    println("Пользователь ${user.username}, его пароль: ${user.password}")
}