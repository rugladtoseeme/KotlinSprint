package org.example.lesson4

fun main() {

    val beansIdealWeatherIsSunny = true
    val beansIdealConditionIsTentOpened = true
    val beansIdealConditionHumidityPercentage = 20
    val beansWorstSeason = "winter"

    val beansTodaysWeatherIsSunny = true
    val beansTodaysConditionIsTentOpened = true
    val beansTodaysConditionHumidityPercentage = 20
    val beansTodaysSeason = "winter"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            beansTodaysWeatherIsSunny == beansIdealWeatherIsSunny &&
                    beansTodaysConditionIsTentOpened == beansIdealConditionIsTentOpened &&
                    beansTodaysConditionHumidityPercentage == beansIdealConditionHumidityPercentage &&
                    beansTodaysSeason != beansWorstSeason
        }"
    )
}