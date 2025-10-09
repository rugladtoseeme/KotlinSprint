package org.example.lesson15

const val MAX_CARGO_FOR_CARGO_CAR = 2
const val MAX_PASSENGERS_FOR_CARGO_CAR = 1
const val MAX_PASSENGERS_FOR_PASSENGER_CAR = 3

abstract class Car(val maxPassengers: Int)

interface Movable {
    fun move()
}

interface CargoMovable {
    fun loadCargo(weight: Int)
    fun unloadCargo()
}

interface PassengerMovable {
    fun loadPassengers(number: Int)
    fun unloadAllPassengers()
}

class PassengerCar : Car(maxPassengers = MAX_PASSENGERS_FOR_PASSENGER_CAR), Movable, PassengerMovable {

    var currentPassengers = 0

    override fun move() {
        println("Легковой автомобиль едет по маршруту.")
    }

    override fun loadPassengers(number: Int) {
        if (currentPassengers >= maxPassengers) {
            println("В легковой автомобиль нельзя добавить более $maxPassengers пассажиров.")
            return
        } else {
            currentPassengers += number

            var unloadedPassengers = currentPassengers - maxPassengers
            if (unloadedPassengers < 0) {
                unloadedPassengers = 0
            } else currentPassengers = maxPassengers

            println("В легковой автомобиль добавлено ${number - unloadedPassengers} новых пассажиров, текущее число пассажиров = ${currentPassengers}")
        }
    }

    override fun unloadAllPassengers() {
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

    override fun loadCargo(weight: Int) {

        if (currentCargo >= maxCargo) {
            println("В грузовик автомобиль нельзя добавить более $maxCargo тонн груза.")
            return
        } else {
            currentCargo += weight

            var unloadedCargo = currentCargo - maxCargo
            if (unloadedCargo < 0) {
                unloadedCargo = 0
            } else currentCargo = maxCargo

            println("В грузовик добавлено ${weight - unloadedCargo} т груза, текущая масса груза = ${currentCargo} т")
        }
    }

    override fun unloadCargo() {
        println("Из грузовика выгружено $currentCargo тонн груза.")
        currentCargo = 0
    }

    override fun loadPassengers(number: Int) {
        if (currentPassengers >= maxPassengers) {
            println("В легковой автомобиль нельзя добавить более $maxPassengers пассажиров.")
            return
        } else {
            currentPassengers += number

            var unloadedPassengers = currentPassengers - maxPassengers
            if (unloadedPassengers < 0) {
                unloadedPassengers = 0
            } else currentPassengers = maxPassengers

            println("В легковой автомобиль добавлено ${number - unloadedPassengers} новых пассажиров, текущее число пассажиров = ${currentPassengers}")
        }
    }

    override fun unloadAllPassengers() {
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

    cargoCar.loadCargo(weightOfCargo)

    cargoCar.loadPassengers(numberOfPassengers)
    numberOfPassengers -= cargoCar.maxPassengers

    passengerCar1.loadPassengers(numberOfPassengers)
    numberOfPassengers -= passengerCar1.maxPassengers

    passengerCar2.loadPassengers(numberOfPassengers)

    cargoCar.move()
    passengerCar1.move()
    passengerCar2.move()

    cargoCar.unloadCargo()
    cargoCar.unloadAllPassengers()

    passengerCar1.unloadAllPassengers()
    passengerCar2.unloadAllPassengers()
}