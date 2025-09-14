package org.example.lesson8

fun main() {

    val ingredientsForPizza = arrayOf("тесто", "моцарелла", "соус", "колбаса", "оливки", "помидор", "лук красный")
    println("Введите название желаемого ингредиента:")
    val ingredient = readln()
    for (i in ingredientsForPizza) {
        if (i == ingredient) {
            println("Ингредиент $ingredient в рецепте есть!")
            return
        }
    }
    println("Такого ингредиента в рецепте нет.")

}