package org.example.lesson22

data class Cat(val name: String, val age: Int, val furColor: String)

fun main() {
    val cat1 = Cat("Тома", 10, "черная")
    println("Кошку зовут ${cat1.component1()}, ей ${cat1.component2()} лет, у нее ${cat1.component3()} шерстка.")
}