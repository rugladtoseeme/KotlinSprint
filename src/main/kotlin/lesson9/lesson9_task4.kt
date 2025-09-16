package org.example.lesson9

fun main() {
    println("Введите 5 ингредиентов, разделяя их \", \":")
    val ingredientsList = readln().split(", ")
    val sortedList = ingredientsList.sorted()
    println("Отсортированный по алфавиту список ингредиентов: ${sortedList.joinToString(", ", postfix = ".")}")
}