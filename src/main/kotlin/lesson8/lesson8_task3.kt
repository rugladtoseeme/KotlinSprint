package org.example.lesson8

fun main() {

    val ingredientsForPizza = arrayOf("тесто", "моцарелла", "соус", "колбаса", "оливки", "помидор", "лук красный")
    println("Введите название желаемого ингредиента:")
    val ingredient = readln()

    if (ingredientsForPizza.contains(ingredient)) println("Ингредиент $ingredient в рецепте есть!")
    else println("Такого ингредиента в рецепте нет.")

}