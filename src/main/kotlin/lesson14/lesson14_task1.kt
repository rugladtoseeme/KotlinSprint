package org.example.lesson14

open class Liner(
    val speed: UInt = 50u,
    val passengers: UInt = 500u,
    val cargoWeight: UInt = 300u,
) {
    override fun toString(): String {
        return "Лайнер: скорость = $speed км/ч, вмещает $passengers пассажиров и $cargoWeight т груза."
    }
}

class Icebreaker(
    speed: UInt = 30u,
    passengers: UInt = 50u,
) : Liner(speed, passengers) {

    fun breakIce() {
        println("Лед трещит. Путь свободен!")
    }

    override fun toString(): String {
        return "Ледокол: скорость = $speed км/ч, вмещает $passengers пассажиров и $cargoWeight т груза. Умеет ломать лед."
    }
}

class CargoShip(
    passengers: UInt = 50u,
    cargoWeight: UInt = 1000u,
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