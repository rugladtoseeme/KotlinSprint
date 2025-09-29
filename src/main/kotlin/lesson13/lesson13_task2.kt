package org.example.lesson13

class Abonent1(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printAbonent() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}\n")
    }
}

fun main() {
    val ab = Abonent1("Ростислав", 89123456789L, "Reddit")
    ab.printAbonent()
    val ab2 = Abonent1("Вячеслав", 8914534789L, null)
    ab2.printAbonent()
}