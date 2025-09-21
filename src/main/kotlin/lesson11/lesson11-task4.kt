package org.example.lesson11

class Category(
    val name: String,
    val picture: String,
    val recipes: MutableList<Recipe>,
    val description: String,
)

class Recipe(
    val name: String,
    val picture: String,
    val portionsNumber: Int,
    val ingredients: List<Ingredient>,
)

class Ingredient(
    val name: String,
    val amount: Int,
    val unitOfMeasure: String,
)

fun main() {

}