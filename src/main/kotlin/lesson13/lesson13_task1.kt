package org.example.lesson13

class Abonent(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)

fun main() {
    val ab = Abonent("luda", 88005553535L, null)
}