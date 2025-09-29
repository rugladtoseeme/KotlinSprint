package org.example.lesson13

class Abonent4(
    val name: String,
    val phoneNumber: Long?,
    val company: String? = null,
) {
    fun printAbonent() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}\n")
    }
}

fun main() {
    println("Введите имя:")
    val name = readln()
    println("Введите номер телефона:")
    var phoneNumber: Long = 0
    try {
        phoneNumber = readln().toLong()
    } catch (e: NumberFormatException) {
        println(e)
    }

    println("Введите компанию:")
    val company = readln()
    val abonent = Abonent4(name, phoneNumber, company)
    abonent.printAbonent()
}