package org.example.lesson8

fun main() {

    println("Введите количество ингредиентов:")
    val ingredientsNumber = readln().toInt()

    val ingredientsArr = arrayOfNulls<String>(ingredientsNumber)
    for (i in 0..ingredientsNumber - 1) {
        println("Введите название ингредиента:")
        ingredientsArr[i] = readln()
    }

    println("Список введеных ингредиентов: ${ingredientsArr.joinToString(", ", postfix = ".")}")
}