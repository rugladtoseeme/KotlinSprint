package org.example.lesson16

private const val PI = 3.14

class Circle(private val radius: Int) {
    fun perimeter() = 2 * PI * radius
    fun area() = PI * radius * radius
}

fun main() {
    val circle = Circle(5)
    println("площадь круга = ${circle.area()}, длина окружности = ${circle.perimeter()}.")
}