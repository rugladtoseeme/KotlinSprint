package org.example.lesson12

const val CALVIN_CELSIUS_RESIDUAL = 273

class Weather3(dayTemperatureCalvin: Int, nightTemperatureCalvin: Int, isPrecipitation: Boolean) {

    val dayTemperature: Int = dayTemperatureCalvin - CALVIN_CELSIUS_RESIDUAL
    val nightTemperature: Int = nightTemperatureCalvin - CALVIN_CELSIUS_RESIDUAL
    val isPrecipitation: Boolean = isPrecipitation

    init {
        println("Погода днем - $dayTemperature градусов, ночью - $nightTemperature градусов, осадки - $isPrecipitation")
    }
}

fun main() {
    var weatherToday = Weather3(dayTemperatureCalvin = 300, nightTemperatureCalvin = 288, isPrecipitation = false)
    var weatherYesterday = Weather3(dayTemperatureCalvin = 299, nightTemperatureCalvin = 285, isPrecipitation = true)
}