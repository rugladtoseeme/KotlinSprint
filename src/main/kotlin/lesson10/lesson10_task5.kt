package org.example.lesson10

const val USERNAME = "user"
const val PASSWORD = "123123"
const val TOKEN_LENGTH = 32

fun authorise(username: String, password: String): String? {
    val tokenChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    if (username == USERNAME && password == PASSWORD) {
        return (1..TOKEN_LENGTH)
            .map { tokenChars.random() }
            .joinToString("")
    } else return null
}

fun getBasket(token: String?): List<String> {
    if (!token.isNullOrBlank()) {
        return listOf("пицца маргарита", "пицца 4 сыра", "картошка фри")
    } else throw Exception("Не удалось авторизоваться: не удалось получить токен.")
}

fun main() {
    println("введите логин:")
    val username = readln()
    println("введите пароль:")
    val password = readln()
    val basket = getBasket(authorise(username, password))
    println("Содержимое корзины: ${basket.joinToString(", ", postfix = ".")}")
}