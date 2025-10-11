package org.example.lesson17

class PostPackage(val packageNumber: Int, currentLocation: String) {

    private var counter = 0

    var currentLocation: String = currentLocation
        set(value) {
            counter++
            field = value
        }

    fun getCounter() = counter
}

fun main() {

    val postPackage = PostPackage(100, "склад")
    postPackage.currentLocation = "Сортировочный пункт 1"
    postPackage.currentLocation = "Сортировочный пункт 2"
    postPackage.currentLocation = "Пункт выдачи"
    println("Заказ ${postPackage.packageNumber} за время пути посетил ${postPackage.getCounter()} пунктов.")
}