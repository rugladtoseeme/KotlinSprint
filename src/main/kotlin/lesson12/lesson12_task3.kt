package org.example.lesson12

const val CALVIN_CELSIUS_RESIDUAL = 273

class Weather2(dayTemperatureCalvin: Int, nightTemperatureCalvin: Int, isPrecipitation: Boolean) {

    val dayTemperature = dayTemperatureCalvin - CALVIN_CELSIUS_RESIDUAL
    val nightTemperature = nightTemperatureCalvin - CALVIN_CELSIUS_RESIDUAL
    val isPrecipitation = isPrecipitation

    fun printWeather() {
        println("Погода днем - $dayTemperature градусов, ночью - $nightTemperature градусов, осадки - $isPrecipitation")
    }
}

fun main() {
    var weatherToday = Weather2(dayTemperatureCalvin = 22, nightTemperatureCalvin = 15, isPrecipitation = false)
    var weatherYesterday = Weather2(dayTemperatureCalvin = 25, nightTemperatureCalvin = 18, isPrecipitation = true)
    weatherToday.printWeather()
    weatherYesterday.printWeather()
}