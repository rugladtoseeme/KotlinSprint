package org.example.lesson15

abstract class WeatherStationStats(val number: Int) {
    abstract fun message()
}

class Temperature(number: Int) : WeatherStationStats(number) {
    override fun message() {
        println("температура составляет $number градусов")
    }
}

class PrecipitationAmount(number: Int) : WeatherStationStats(number) {
    override fun message() {
        println("показатель влажности = $number%")
    }
}

class WeatherServer() {
    fun sendData(weatherStat: WeatherStationStats) {
        weatherStat.message()
    }
}

fun main() {
    val server = WeatherServer()
    server.sendData(Temperature(25))
    server.sendData(PrecipitationAmount(45))
}