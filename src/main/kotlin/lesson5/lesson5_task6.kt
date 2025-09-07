package org.example.lesson5

import kotlin.math.pow

fun main() {

    println("Введите ваш рост в сантиметрах")
    val height: Float = readln().toFloat()
    println("Введите ваш вес в килограммах")
    val weight: Float = readln().toFloat()

    val smInMeter = 100
    val heightMeters = height / smInMeter

    val IMT = weight / heightMeters.pow(2)

    var weightCategoryText = ""
    if (IMT < 18.5) {
        println("ИМТ меньше 18.5: Недостаточная масса тела.")
        weightCategoryText = "Недостаточная масса тела"
    } else if (IMT in 18.5..25.0) {
        println("ИМТ между 18.5 и 25: Нормальная масса тела.")
        weightCategoryText = "Нормальная масса тела"
    } else if (IMT in 25.0..30.0) {
        println("ИМТ между 25.0 и 30: Избыточная масса тела.")
        weightCategoryText = "Избыточная масса тела"
    } else {
        println("ИМТ более 30: Ожирение.")
        weightCategoryText = "Ожирение"
    }

    println("Ваш ИМТ составляет ${String.format("%.2f", IMT)}. Диагноз: $weightCategoryText")

}