package org.example.lesson13

class Abonent2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printAbonent() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}\n")
    }
}

fun main() {
    val abonents =
        listOf<Abonent2>(
            Abonent2("вячеслав", 81111111111, "google"),
            Abonent2("владислав", 82222222222, "null"),
            Abonent2("ростислав", 83333333333, null),
            Abonent2("святослав", 84444444444, "google"),
            Abonent2("ярослав", 85555555555, null)
        )
    println(abonents.filter { it.company != null }.map { it.company }.distinct().joinToString(", ", postfix = "."))
}