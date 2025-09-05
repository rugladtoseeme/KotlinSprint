package org.example.lesson4

fun main() {

    val weightBorderLeft = 35
    val weightBorderRight = 100
    val volumeBorderRight = 100

    val cargo1Weight = 20
    val cargo1Volume = 50

    val cargo2Weight = 50
    val cargo2Volume = 100

    println("Груз с весом $cargo1Weight кг и объемом $cargo1Volume л соответствует категории 'Average': ${cargo1Weight > weightBorderLeft && cargo1Weight <= weightBorderRight && cargo1Volume < volumeBorderRight}")
    println("Груз с весом $cargo2Weight кг и объемом $cargo2Volume л соответствует категории 'Average': ${cargo2Weight > weightBorderLeft && cargo2Weight <= weightBorderRight && cargo2Volume < volumeBorderRight}")
}