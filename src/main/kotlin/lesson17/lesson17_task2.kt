package org.example.lesson17

class SpaceShip(name: String, val averageSpeed: Double, val port: String) {

    var name: String = name
        set(value) {
            println("Нельзя изменить название корабля!")
        }

    override fun toString(): String {
        return "Корабль $name, средняя скорость: $averageSpeed км/c, порт приписки: $port."
    }
}

fun main() {
    val ship = SpaceShip("ship1", 100.0, "port")
    ship.name = "ship100"
    println(ship)
}