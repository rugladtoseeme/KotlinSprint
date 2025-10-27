package org.example.lesson22

class RegularBook(val name: String, val author: String)

data class DataBook(val name: String, val author: String)

fun main() {
    val book1 = RegularBook("Хоббит, или Туда и обратно", "Дж. Р. Р. Толкин")
    val book2 = RegularBook("Хоббит, или Туда и обратно", "Дж. Р. Р. Толкин")

    val book3 = DataBook("Хоббит, или Туда и обратно", "Дж. Р. Р. Толкин")
    val book4 = DataBook("Хоббит, или Туда и обратно", "Дж. Р. Р. Толкин")

    //Выведет false, потому что метод equals по умолчанию сравнивает значения ссылок,
    //а объекты ссылаются на разные облати памяти
    println(book1 == book2)

    //Выведет true, потому что по у data-классов переопределен метод equals,
    //и он сравнивает объекты по значениям их полей
    println(book3 == book4)
}