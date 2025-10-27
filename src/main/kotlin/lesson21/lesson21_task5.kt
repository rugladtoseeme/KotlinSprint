package org.example.lesson21

fun Map<String, Int>.maxCategory() = maxByOrNull { it.value }?.key

fun main() {

    val player = mapOf<String, Int>(
        "Магия" to 3,
        "Ловкость рук" to 8,
        "Алхимия" to 6,
        "Харизма" to 8,
        "Фехтование" to 2,
        "Стрельба" to 5
    )

    println("Ваш наилучший навык - это ${player.maxCategory()}")
}