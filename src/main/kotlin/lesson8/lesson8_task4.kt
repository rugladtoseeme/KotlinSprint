package org.example.lesson8

fun main() {

    val ingredientsForPizza = arrayOf("тесто", "моцарелла", "соус", "колбаса", "оливки", "помидор", "лук красный")
    println("Введите название ингредиента, который хотите заменить")
    do {
        val ingredient = readln()
        if (ingredientsForPizza.contains(ingredient)) {
            println("Теперь введите, каким ингредиентом хотите заменить")
            val ingredientNew = readln()
            ingredientsForPizza[ingredientsForPizza.indexOf(ingredient)] = ingredientNew
            println("Готово! Вы сохранили следующий список: ${ingredientsForPizza.joinToString(", ", postfix = ".")}")
        } else println("Такого ингредиента в рецепте нет. Попробуйте заново.")
    } while (!ingredientsForPizza.contains(ingredient))
}