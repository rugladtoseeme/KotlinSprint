package org.example.lesson4

fun main() {

    val isShipDamagedIdeal = false
    val shipNumberOfPeopleBorderLeft = 55
    val shipNumberOfPeopleBorderRight = 70
    val shipNumberOfProvisionBoxesLeftBorder = 50

    val isWeatherGoodAlternativeCondition = true

    println("введите, поврежден ли корабль")
    val isShipDamagedCurrent = readLine().toBoolean()
    println("введите количество человек в команде")
    val currentNumberOfPeople = readln().toIntOrNull() ?: 0
    println("введите, хороша ли погода")
    val isWeatherGoodCurrent = readLine().toBoolean()
    println("введите количество ящиков провизии на корабле")
    val currentNumberOfProvisionBoxes = readln().toIntOrNull() ?: 0

    println(
        "Условия позволяют выходить в плавание: ${
            (isShipDamagedCurrent == isShipDamagedIdeal &&
                    currentNumberOfPeople in shipNumberOfPeopleBorderLeft..shipNumberOfPeopleBorderRight &&
                    currentNumberOfProvisionBoxes > shipNumberOfProvisionBoxesLeftBorder)
                    ||
                    (currentNumberOfPeople == shipNumberOfPeopleBorderRight &&
                            currentNumberOfProvisionBoxes >= shipNumberOfProvisionBoxesLeftBorder &&
                            isWeatherGoodCurrent == isWeatherGoodAlternativeCondition)
        }"
    )
}