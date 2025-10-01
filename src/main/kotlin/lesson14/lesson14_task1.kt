package org.example.lesson14

open class Liner(
    open val speed: Int = 50,
    open val passengers: Int = 500,
    open val cargoWeight: Int = 300,
) {
    override fun toString(): String {
        return "Лайнер: скорость = $speed км/ч, вмещает $passengers пассажиров и $cargoWeight т груза."
    }
}

class Icebreaker(
    speed: Int = 30,
    passengers: Int = 50,
) : Liner(speed, passengers) {

    fun breakIce() {
        println("Лед трещит. Путь свободен!")
    }

    override fun toString(): String {
        return "Ледокол: скорость = $speed км/ч, вмещает $passengers пассажиров и $cargoWeight т груза. Умеет ломать лед."
    }
}

class CargoShip(
    passengers: Int = 50,
    cargoWeight: Int = 1000,
) : Liner(passengers, cargoWeight) {
    override fun toString(): String {
        return "Грузовой корабль: скорость = $speed км/ч, вмещает $passengers пассажиров и $cargoWeight т груза."
    }
}

fun main() {
    val liner = Liner()
    println(liner)
    val icebreaker = Icebreaker()
    println(icebreaker)
    val cargoShip = CargoShip()
    println(cargoShip)
}