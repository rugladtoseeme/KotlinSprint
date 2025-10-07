package org.example.lesson15

const val MAX_CARGO_FOR_CARGO_CAR = 2
const val MAX_PASSENGERS_FOR_CARGO_CAR = 1
const val MAX_PASSENGERS_FOR_PASSENGER_CAR = 3

abstract class Car(val maxPassengers: Int)

interface Movable {
    fun move()
}

interface CargoMovable {
    fun loadCargo()
    fun unloadCargo()
}

interface PassengerMovable {
    fun loadPassenger()
    fun unloadPassengers()
}

class PassengerCar : Car(maxPassengers = MAX_PASSENGERS_FOR_PASSENGER_CAR), Movable, PassengerMovable {

    var currentPassengers = 0

    override fun move() {
        println("Легковой автомобиль едет по маршруту.")
    }

    override fun loadPassenger() {
        if (currentPassengers < maxPassengers) {
            println("В легковой автомобиль добавлен новый пассажир, текущее число пассажиров = ${++currentPassengers}")
        } else println("В легковой автомобиль нельзя добавить более $maxPassengers пассажиров.")
    }

    override fun unloadPassengers() {
        println("Из легкового автомобиля выгружено $currentPassengers пассажиров.")
        currentPassengers = 0
    }
}

class CargoCar : Car(maxPassengers = MAX_PASSENGERS_FOR_CARGO_CAR), Movable, CargoMovable, PassengerMovable {

    var currentCargo = 0
    var currentPassengers = 0
    val maxCargo = MAX_CARGO_FOR_CARGO_CAR

    override fun move() {
        println("Грузовик едет по маршруту.")
    }

    override fun loadCargo() {
        if (currentCargo < maxCargo) {
            println("В грузовик добавлена одна тонна груза, общий вес груза = ${++currentCargo}")
        } else println("В грузовик нельзя добавить более $maxCargo тонн груза.")
    }

    override fun unloadCargo() {
        println("Из грузовика выгружено $currentCargo тонн груза.")
        currentCargo = 0
    }

    override fun loadPassenger() {
        if (currentPassengers < maxPassengers) {
            println("В грузовик добавлен новый пассажир, текущее число пассажиров = ${++currentPassengers}")
        } else println("В грузовик нельзя добавить более $maxPassengers пассажиров.")
    }

    override fun unloadPassengers() {
        println("Из грузовика выгружено $currentPassengers пассажиров.")
        currentPassengers = 0
    }
}

fun main() {

    val cargoCar = CargoCar()
    val passengerCar1 = PassengerCar()
    val passengerCar2 = PassengerCar()

    var numberOfPassengers = 6
    var weightOfCargo = 2

    while (cargoCar.currentCargo < cargoCar.maxCargo) {
        cargoCar.loadCargo()
        weightOfCargo--
    }

    while (cargoCar.currentPassengers < cargoCar.maxPassengers) {
        cargoCar.loadPassenger()
        numberOfPassengers--
    }

    while (passengerCar1.currentPassengers < passengerCar1.maxPassengers) {
        passengerCar1.loadPassenger()
        numberOfPassengers--
    }

    while (passengerCar2.currentPassengers < passengerCar2.maxPassengers && numberOfPassengers > 0) {
        passengerCar2.loadPassenger()
        numberOfPassengers--
    }

    cargoCar.move()
    passengerCar1.move()
    passengerCar2.move()

    cargoCar.unloadCargo()
    cargoCar.unloadPassengers()

    passengerCar1.unloadPassengers()
    passengerCar2.unloadPassengers()
}