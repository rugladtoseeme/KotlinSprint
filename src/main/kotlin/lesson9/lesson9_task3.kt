package org.example.lesson9

fun main() {

    var ingredientsForOmelet = mutableListOf(2, 50, 15)
    println("Введите количество порций")
    val numberOfPortions = readln().toInt()
    for (i in 0..ingredientsForOmelet.size - 1) {
        ingredientsForOmelet[i] *= numberOfPortions
    }
    println("На $numberOfPortions порций омлета требуется ингредиентов: яиц - ${ingredientsForOmelet[0]} шт., молока - ${ingredientsForOmelet[1]} мл., сливочного масла - ${ingredientsForOmelet[2]} г.")

}