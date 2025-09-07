package org.example.lesson5

import kotlin.math.pow

const val IMT_LOW_WEIGHT_MAX = 18.5
const val IMT_NORMAL_WEIGHT_MAX = 25.0
const val IMT_OBESITY_WEIGHT_MIN = 30.0

fun enterNumbers(message: String): Float {
    println(message)
    return readln().toFloat()
}

fun main() {

    val height: Float = enterNumbers("Введите ваш рост в сантиметрах")
    val weight: Float = enterNumbers("Введите ваш вес в килограммах")

    val smInMeter = 100
    val heightMeters = height / smInMeter

    val imt = weight / heightMeters.pow(2)

    var weightCategory = when {
        imt < IMT_LOW_WEIGHT_MAX -> "Недостаточная масса тела"
        imt in IMT_LOW_WEIGHT_MAX..IMT_NORMAL_WEIGHT_MAX -> "Нормальная масса тела"
        imt in IMT_NORMAL_WEIGHT_MAX..IMT_OBESITY_WEIGHT_MIN -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("Ваш ИМТ составляет ${String.format("%.2f", imt)}. Диагноз: $weightCategory.")

}