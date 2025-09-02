package org.example.lesson2

fun main() {

    val trainDepartureTimeHours = 9
    val trainDepartureTimeMinutes = 39
    val travelTimeMinutesTotal = 457

    val travelTimeHours = travelTimeMinutesTotal / 60
    var travelTimeMinutes = travelTimeMinutesTotal % 60

    val trainArrivalTimeHours =
        trainDepartureTimeHours + travelTimeHours + (travelTimeMinutes + trainDepartureTimeMinutes) / 60
    val trainArrivalTimeMinutes = (travelTimeMinutes + trainDepartureTimeMinutes) % 60

    println("$trainArrivalTimeHours:$trainArrivalTimeMinutes")
}