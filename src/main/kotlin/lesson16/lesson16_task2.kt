package org.example.lesson16

import kotlin.math.pow

private const val PI = 3.14

class Circle(private val radius: Double) {
    fun perimeter() = 2 * PI * radius
    fun area() = PI * radius.pow(2)
}

fun main() {
    val circle = Circle(5.0)
    println("площадь круга = ${circle.area()}, длина окружности = ${circle.perimeter()}.")
}