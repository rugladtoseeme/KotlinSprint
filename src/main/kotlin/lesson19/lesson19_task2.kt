package org.example.lesson19

enum class ProductCategory {
    CLOTHES,
    SHOES,
    STATIONERY,
    ELECTRONICS,
    FOOD;

    fun getName(): String = when {
        (this == CLOTHES) -> "Одежда"
        (this == SHOES) -> "Обувь"
        (this == STATIONERY) -> "Канцелярия"
        (this == ELECTRONICS) -> "Техника"
        (this == FOOD) -> "Продукты питания"
        else -> "Неизвестная категория"
    }

}

class Product(val id: Int, val name: String, val category: ProductCategory) {
    fun printInfo() = println("Товар \"$name\": id = $id, категория: ${category.getName()}")
}

fun main() {

    val prod1 = Product(1, "карандаш механический", ProductCategory.STATIONERY)
    prod1.printInfo()
    val prod2 = Product(2, "колбаса сырокопченая", ProductCategory.FOOD)
    prod2.printInfo()
}