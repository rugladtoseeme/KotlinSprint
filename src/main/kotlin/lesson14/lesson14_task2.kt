package org.example.lesson14

open class Liner1(
    val speed: UInt = 50u,
    val passengers: UInt = 500u,
    val cargoWeight: UInt = 300u,
) {
    override fun toString(): String {
        return """Лайнер: скорость = $speed км/ч, вмещает $passengers пассажиров и $cargoWeight т груза.
            |Способ погрузки: выдвигается горизонтальный трап со шкафута.
        """.trimMargin()
    }

    open fun loadCargo() {
        println("Выдвигается горизонтальный трап со шкафута.")
    }
}

class Icebreaker1(
    speed: UInt = 30u,
    passengers: UInt = 50u,
) : Liner1(speed, passengers) {

    fun breakIce() {
        println("Лед трещит. Путь свободен!")
    }

    override fun toString(): String {
        return """Ледокол: скорость = $speed км/ч, вмещает $passengers пассажиров и $cargoWeight т груза. 
            |Способ погрузки: открываются ворота со стороны кормы
        """.trimMargin()
    }

    override fun loadCargo() {
        println("Открываются ворота со стороны кормы.")
    }
}

class CargoShip1(
    passengers: UInt = 50u,
    cargoWeight: UInt = 1000u,
) : Liner1(passengers, cargoWeight) {
    override fun toString(): String {
        return """Грузовой корабль: скорость = $speed км/ч, вмещает $passengers пассажиров и $cargoWeight т груза.
            |Способ погрузки: активируется погрузочный кран.
        """.trimMargin()
    }

    override fun loadCargo() {
        println("Активируется погрузочный кран.")
    }
}

fun main() {
    val liner = Liner1()
    println(liner)
    val icebreaker = Icebreaker1()
    println(icebreaker)
    val cargoShip = CargoShip1()
    println(cargoShip)
}