package org.example.lesson11

class Category(
    val id: Int,
    val name: String,
    val picture: String,
    val recipes: List<Recipe>,
    val description: String,
)

class Recipe(
    val id: Int,
    val name: String,
    val picture: String,
    val portionsNumber: Int,
    val ingredients: List<Ingredient>,
    val cookingMethod: List<String>,
)

class Ingredient(
    val name: String,
    val amount: String,
    val unitOfMeasure: String,
)

fun main() {

}