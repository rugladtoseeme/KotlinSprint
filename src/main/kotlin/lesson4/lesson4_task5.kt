package org.example.lesson4

fun main() {

    val shipIsDamagedConditionIdeal = false
    val shipNumberOfPeopleBorderLeft = 55
    val shipNumberOfPeopleBorderRight = 70
    val shipNumberOfProvisionBoxesLeftBorder = 50

    val idealWeatherAlternativeCondition = true

    println("введите, поврежден ли корабль")
    val currentConditionIsDamaged = readLine().toBoolean()
    println("введите, количество человек в команде")
    val currentConditionNumberOfPeople = readln().toIntOrNull() ?: 0
    println("введите, хороша ли погода")
    val currentConditionIsWeatherGood = readLine().toBoolean()
    println("введите количество ящиков провизии на корабле")
    val currentConditionNumberOfProvisionBoxes = readln().toIntOrNull() ?: 0

    println(
        "Условия позволяют выходить в плавание: ${
            (currentConditionIsDamaged == shipIsDamagedConditionIdeal &&
                    currentConditionNumberOfPeople in shipNumberOfPeopleBorderLeft..shipNumberOfPeopleBorderRight &&
                    currentConditionNumberOfProvisionBoxes > shipNumberOfProvisionBoxesLeftBorder)
                    ||
                    (currentConditionNumberOfPeople == shipNumberOfPeopleBorderRight &&
                            currentConditionNumberOfProvisionBoxes >= shipNumberOfProvisionBoxesLeftBorder &&
                            currentConditionIsWeatherGood == idealWeatherAlternativeCondition)
        }"
    )

}