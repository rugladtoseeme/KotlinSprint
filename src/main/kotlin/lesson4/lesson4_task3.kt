package org.example.lesson4

const val IS_SUNNY = true
const val IS_TENT_OPEN = true
const val BEANS_IDEAL_HUMIDITY_PERCENTAGE = 20
const val BEANS_WORST_SEASON = "winter"

fun main() {

    val isSunnyToday = true
    val isTentOpenToday = true
    val beansTodaysHumidityPercentage = 20
    val beansTodaysSeason = "winter"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            isSunnyToday == IS_SUNNY &&
                    isTentOpenToday == IS_TENT_OPEN &&
                    beansTodaysHumidityPercentage == BEANS_IDEAL_HUMIDITY_PERCENTAGE &&
                    beansTodaysSeason != BEANS_WORST_SEASON
        }"
    )
}