package org.example.lesson22

data class Cat(val name: String, val age: Int, val furColor: String)

fun main() {
    val cat1 = Cat("Тома", 10, "черная")
    val (name, age, funColor) = cat1
    println("Кошку зовут $name, ей $age лет, у нее $funColor шерстка.")
}