package org.example.lesson2

fun main() {

    val trainDepartureTimeHours = 9
    val trainDepartureTimeMinutes = 39
    val travelTimeMinutesTotal = 457

    val minutesInAnHour = 60

    val travelTimeHours = travelTimeMinutesTotal / minutesInAnHour
    val travelTimeMinutes = travelTimeMinutesTotal % minutesInAnHour

    val trainArrivalTimeHours =
        trainDepartureTimeHours + travelTimeHours + (travelTimeMinutes + trainDepartureTimeMinutes) / minutesInAnHour
    val trainArrivalTimeMinutes = (travelTimeMinutes + trainDepartureTimeMinutes) % minutesInAnHour

    println("$trainArrivalTimeHours:$trainArrivalTimeMinutes")
}