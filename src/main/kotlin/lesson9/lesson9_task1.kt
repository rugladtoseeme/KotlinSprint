package org.example.lesson9

fun main() {

    val ingredientsList = listOf("рис", "нори", "лосось", "соус", "кунжут", "огурец", "сыр сливочный")
    println("В рецепте есть следующие ингредиенты: ${ingredientsList.joinToString(", ", postfix = ".")}")
    ingredientsList.forEach {
        println(it)
    }
}