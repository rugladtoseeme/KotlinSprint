package org.example.lesson21

fun List<Int>.evenNumbersSum() = this.filter { it % 2 == 0 }.sum()

fun main() {
    val integers = listOf<Int>(2, 1, 3, 5, 6, 2)
    println("Сумма четных элементов списка = ${integers.evenNumbersSum()}")
}