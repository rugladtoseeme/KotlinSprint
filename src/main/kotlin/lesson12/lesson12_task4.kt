package org.example.lesson12

const val CALVIN_CELSIUS_RESIDUAL = 273

class Weather3 {

    val dayTemperature: Int
    val nightTemperature: Int
    val isPrecipitation: Boolean

    constructor(dayTemperatureCalvin: Int, nightTemperatureCalvin: Int, isPrecipitation: Boolean) {
        this.dayTemperature = dayTemperatureCalvin - CALVIN_CELSIUS_RESIDUAL
        this.nightTemperature = nightTemperatureCalvin - CALVIN_CELSIUS_RESIDUAL
        this.isPrecipitation = isPrecipitation
        println("Погода днем - $dayTemperature градусов, ночью - $nightTemperature градусов, осадки - $isPrecipitation")
    }
}

fun main() {
    var weatherToday = Weather3(dayTemperatureCalvin = 300, nightTemperatureCalvin = 288, isPrecipitation = false)
    var weatherYesterday = Weather3(dayTemperatureCalvin = 299, nightTemperatureCalvin = 285, isPrecipitation = true)
}