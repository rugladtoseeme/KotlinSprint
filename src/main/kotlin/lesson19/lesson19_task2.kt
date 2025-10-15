package org.example.lesson19

enum class ProductCategory {
    CLOTHES {
        override fun getName() = "Одежда"
    },

    SHOES {
        override fun getName() = "Обувь"
    },

    STATIONERY {
        override fun getName() = "Канцтовары"
    },

    ELECTRONICS {
        override fun getName() = "Техника"
    },

    FOOD {
        override fun getName() = "Продукты питания"
    };

    abstract fun getName(): String
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