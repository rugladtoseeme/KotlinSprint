package org.example.lesson12

class Weather1(val dayTemperature: Byte, val nightTemperature: Byte, val isPrecipitation: Boolean) {
    fun printWeather() {
        println("Погода днем - $dayTemperature градусов, ночью - $nightTemperature градусов, осадки - $isPrecipitation")
    }
}

fun main() {
    var weatherToday = Weather1(dayTemperature = 22, nightTemperature = 15, isPrecipitation = false)
    var weatherYesterday = Weather1(dayTemperature = 25, nightTemperature = 18, isPrecipitation = true)
    weatherToday.printWeather()
    weatherYesterday.printWeather()
}