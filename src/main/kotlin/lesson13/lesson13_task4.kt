package org.example.lesson13

class Abonent3(
    val name: String,
    val phoneNumber: Long?,
    val company: String? = null,
) {
    fun printAbonent() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}\n")
    }
}

fun main() {
    val abonents = mutableListOf<Abonent3>()
    do {
        var choice = "да"
        println("Введите имя:")
        val name = readln()

        println("Введите телефонный номер:")
        val phoneNumber = readln().toLongOrNull()
        if (phoneNumber == null) {
            println("Вы ввели пустой номер, не удалось создать запись телефонной книги.")
            continue
        }

        println("Введите компанию:")
        val company = readln()
        abonents.add(
            Abonent3(name, phoneNumber, if (company.isNullOrBlank()) null else company)
        )

        println("Продолжить заполнение телефонной книги? (да/нет)")
        choice = readln()

    } while (choice.equals("да", ignoreCase = true))
    for (i in abonents) {
        i.printAbonent()
    }
}