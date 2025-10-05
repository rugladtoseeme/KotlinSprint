package org.example.lesson15

abstract class AbstractUser(val username: String) {
    fun readForum() {
        println("пользователь $username читает форум")
    }

    fun writeMessage() {
        println("пользователь $username печатает сообщение")
    }
}

class User(username: String) : AbstractUser(username)
class Administrator(username: String) : AbstractUser(username) {
    fun deleteMessage() {
        println("администратор $username удаляет сообщение")
    }
}

fun main() {

    val admin = Administrator("anna")
    val user = User("elena")
    admin.writeMessage()
    admin.deleteMessage()
    user.writeMessage()
    user.readForum()
}