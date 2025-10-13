package org.example.lesson18

class Order(val id: Int) {

    private var products: MutableList<String> = mutableListOf()

    private var product: String = ""

    fun addProducts(prod: String) {
        if (products.isEmpty())
            if (product == "") product = prod
            else {
                products = mutableListOf(prod)
                products.add(product)
                product = ""
            }
        else products!!.add(prod)
    }

    fun addProducts(prods: List<String>) {
        if (products.isEmpty())
            if (product != "") {
                products = mutableListOf()
                products.add(product)
                product = ""
                products.addAll(prods)
            } else {
                products = mutableListOf()
                products.addAll(prods)
            }
        else products.addAll(prods)
    }

    private fun printOrder(product: String?) {
        println("Заказан товар: ${product.orEmpty()}")
    }

    private fun printOrder(products: MutableList<String>) {
        println("Заказаны следующие товары: ${products.joinToString(", ", postfix = ".")}")
    }

    fun printOrder() {
        if (products.isEmpty()) printOrder(product)
        else printOrder(products)
    }
}

fun main() {

    val order1 = Order(1)
    order1.addProducts("ножницы")
    order1.printOrder()

    val order2 = Order(2)
    order2.addProducts(listOf<String>("клей", "картон"))
    order2.addProducts("маркер")
    order2.printOrder()
}