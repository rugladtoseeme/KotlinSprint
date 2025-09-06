package org.example.lesson5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18
const val AGE_OF_SUBMAJORITY_16 = 16
const val AGE_OF_SUBMAJORITY_17 = 17

fun main() {

    println("введите год вашего рождения:")
    val userYearOfBirth = readln().toInt()

    val userAge = LocalDate.now().year - userYearOfBirth

    val resultText = if (userAge >= AGE_OF_MAJORITY)
        "Показать экран со скрытым контентом!"
    else if (userAge == AGE_OF_SUBMAJORITY_16 || userAge == AGE_OF_SUBMAJORITY_17)
        "Show limited content"
    else
        "Back to main screen"

    println(resultText)
}