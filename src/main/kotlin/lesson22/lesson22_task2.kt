package org.example.lesson22

class RegularBook1(val name: String, val author: String)

data class DataBook1(val name: String, val author: String)

fun main() {
    val book1 = RegularBook1("Хоббит, или Туда и обратно", "Дж. Р. Р. Толкин")

    val book2 = DataBook1("Хоббит, или Туда и обратно", "Дж. Р. Р. Толкин")

    //Не информативный вывод: по умолчанию toString() возвращает полное имя класса + хешкод объекта
    println(book1)

    //Красивый вывод: переопределенный в dada-классе toString() возвращает
    //строку в удобном формате со всеми полями класса
    println(book2)
}