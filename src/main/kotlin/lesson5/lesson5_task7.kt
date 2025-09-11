package org.example.lesson5

fun main() {

    println("Введите расстояние поездки в километрах")
    val pathLength: Float = readln().toFloat()
    println("Введите расход топлива на 100 км в литрах")
    val litersFor100Km: Float = readln().toFloat()
    println("Введите текущую цену на литр топлива")
    val priceFor1LiterOfFuel: Float = readln().toFloat()

    val fuelLitersTotal = (pathLength * litersFor100Km) / 100

    val totalFuelPrice = fuelLitersTotal * priceFor1LiterOfFuel

    println("Общий расход топлива на поездку составил ${String.format("%.2f", fuelLitersTotal)}  литров.")
    println("Стоимость топлива составила ${String.format("%.2f", totalFuelPrice)} рублей.")

}