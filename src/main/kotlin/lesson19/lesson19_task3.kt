package org.example.lesson19

import kotlin.Nothing

class SpaceShip() {

    fun takeOff() {
        //TODO реализовать функцию взлета
    }

    fun land(): Nothing = throw NotImplementedError("Функция посадки еще не реализована")

    fun shoot() {
        println("Бах!")
    }
}

fun main() {
    val ship = SpaceShip()
    ship.shoot()
    ship.takeOff()
    ship.land()
}