package org.example.lesson9

fun main() {

    val ingredientsForOmelet = mutableListOf(2, 50, 15)
    val eggsIndex = 0
    val milkIndex = 1
    val butterIndex = 2
    println("Введите количество порций")
    val numberOfPortions = readln().toInt()
    val ingredientsForPortions = ingredientsForOmelet.map { it * numberOfPortions }

    println(
        """На $numberOfPortions порций омлета требуется ингредиентов: яиц - ${ingredientsForPortions[eggsIndex]} шт., 
            |молока - ${ingredientsForPortions[milkIndex]} мл., 
            |сливочного масла - ${ingredientsForPortions[butterIndex]} г.""".trimMargin()
    )


}