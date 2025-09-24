package org.example.lesson12

import kotlin.random.Random

const val DAYS_IN_MONTH = 30

class Weather4(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val isPrecipitation: Boolean,
)

fun main() {

    val nightTemperatureRange = (15..25)
    val dayTemperatureRange = (20..35)
    val weatherForMonth: MutableList<Weather4> = mutableListOf()
    for (i in 1..DAYS_IN_MONTH) {
        weatherForMonth.add(
            Weather4(
                dayTemperatureRange.random(),
                nightTemperatureRange.random(),
                Random.nextBoolean()
            )
        )
    }

    val averageDayTemperatureForMonth = weatherForMonth.map { it.dayTemperature }.average()
    val averageNightTemperatureForMonth = weatherForMonth.map { it.nightTemperature }.average()
    val rainyDaysForMonth = weatherForMonth.count { it.isPrecipitation }

    println(
        """Среднемесячная температура:
            |Днем: ${String.format("%.2f", averageDayTemperatureForMonth)} градусов, 
            |Ночью: ${String.format("%.2f", averageNightTemperatureForMonth)} градусов,
            |$rainyDaysForMonth дней из $DAYS_IN_MONTH были с осадками.""".trimMargin()
    )
}