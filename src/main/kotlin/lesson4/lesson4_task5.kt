package org.example.lesson4

const val IS_SHIP_DAMAGED_IDEAL = false
const val MIN_CREW_SIZE = 55
const val MAX_CREW_SIZE = 70
const val MIN_NUMBER_OF_PROVISION_BOXES = 50

const val IS_WEATHER_GOOD_ALTERNATIVE = true

fun main() {

    println("введите, поврежден ли корабль (true/false)")
    val isShipDamagedCurrent = readln().toBoolean()
    println("введите количество человек в команде")
    val currentNumberOfPeople = readln().toIntOrNull() ?: 0
    println("введите, хороша ли погода (true/false)")
    val isWeatherGoodCurrent = readln().toBoolean()
    println("введите количество ящиков провизии на корабле")
    val currentNumberOfProvisionBoxes = readln().toIntOrNull() ?: 0

    println(
        "Условия позволяют выходить в плавание: ${
            (isShipDamagedCurrent == IS_SHIP_DAMAGED_IDEAL &&
                    currentNumberOfPeople in MIN_CREW_SIZE..MAX_CREW_SIZE &&
                    currentNumberOfProvisionBoxes > MIN_NUMBER_OF_PROVISION_BOXES)
                    ||
                    (currentNumberOfPeople == MAX_CREW_SIZE &&
                            currentNumberOfProvisionBoxes >= MIN_NUMBER_OF_PROVISION_BOXES &&
                            isWeatherGoodCurrent == IS_WEATHER_GOOD_ALTERNATIVE)
        }"
    )
}