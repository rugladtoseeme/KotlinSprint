package org.example.lesson12

class Weather {
    var dayTemperature: Byte = 0
    var nightTemperature: Byte = 0
    var isPrecipitation: Boolean = false

    fun printWeather() {
        println("Погода днем - $dayTemperature градусов, ночью - $nightTemperature градусов, осадки - $isPrecipitation")
    }
}

fun main() {

    var weatherToday = Weather()
    weatherToday.dayTemperature = 22
    weatherToday.nightTemperature = 15

    var weatherYesterday = Weather()
    weatherYesterday.dayTemperature = 25
    weatherYesterday.nightTemperature = 18
    weatherYesterday.isPrecipitation = true

    weatherToday.printWeather()
    weatherYesterday.printWeather()
}