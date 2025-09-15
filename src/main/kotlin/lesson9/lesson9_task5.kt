package org.example.lesson9

fun main() {

    println("Введите 5 ингредиентов.")
    val ingredientsList = mutableListOf<String>()
    for (i in 1..5) {
        println("Введите ингредиент:")
        ingredientsList.add(readln())
    }

    println(ingredientsList.distinct().sorted().joinToString(", ").replaceFirstChar { it.uppercase() })
}