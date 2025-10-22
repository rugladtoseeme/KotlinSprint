package org.example.lesson21

fun Map<String, Int>.maxCategory() = maxByOrNull { it.value }?.key

fun main() {

    val player = mutableMapOf<String, Int>()
    player.put("Магия", 3)
    player.put("Стрельба", 5)
    player.put("Фехтование", 2)
    player.put("Алхимия", 6)
    player.put("Харизма", 8)
    player.put("Ловкость рук", 8)

    println("Ваш наилучший навык - это ${player.maxCategory()}")
}