package org.example.lesson9

fun main() {
    val baseIngredients = mutableListOf("яйцо", "соль", "масло сливочное")
    println("В рецепте есть базовые ингредиенты: ${baseIngredients.joinToString(", ", postfix = ".")}")
    println("Желаете добавить еще? (да/нет)")
    if (readln().equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        baseIngredients.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: ${baseIngredients.joinToString(", ", postfix = ".")}")
    } else {
        println("Завершение работы.")
    }
}