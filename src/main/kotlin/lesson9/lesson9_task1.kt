package org.example.lesson9

fun main() {

    val ingredients = listOf("рис", "нори", "лосось", "соус", "кунжут", "огурец", "сыр сливочный")
    println("В рецепте есть следующие ингредиенты: ${ingredients.joinToString(", ", postfix = ".")}")
    ingredients.forEach {
        println(it)
    }
}