package org.example.lesson20

fun main() {
    println("Введите имя пользователя:")
    val username = readln()
    val greet: () -> String = fun() = "С наступающим Новым годом, $username!"
    println(greet())
}