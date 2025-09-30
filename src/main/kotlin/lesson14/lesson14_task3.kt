package org.example.lesson14

const val PI = 3.1415926

abstract class Figure(val color: String) {
    abstract fun perimeter(): Double
    abstract fun area(): Double
}

class Circle(
    val radius: Double,
    color: String
) : Figure(color) {
    override fun perimeter(): Double {
        return 2 * PI * radius
    }

    override fun area(): Double {
        return PI * radius * radius
    }

    override fun toString(): String {
        return "$color круг: радиус = $radius"
    }
}

class Rectangle(
    val length: Double,
    val width: Double,
    color: String
) : Figure(color) {
    override fun perimeter(): Double {
        return 2 * (length + width)
    }

    override fun area(): Double {
        return length * width
    }

    override fun toString(): String {
        return "$color прямоугольник: длина = $length, ширина = $width"
    }
}

fun main() {

    val colorWhite = "Белый"
    val colorBlack = "Черный"
    val figures = listOf<Figure>(
        Circle(5.0, colorWhite),
        Rectangle(2.5, 4.0, colorBlack),
        Rectangle(5.0, 4.0, colorWhite),
        Circle(7.0, colorWhite),
        Rectangle(4.0, 15.0, colorBlack),
        Circle(3.0, colorBlack),
    )
    for (figure in figures) {
        println(figure)
    }

    val blacksPerimeter = figures.filter { it.color == colorBlack }.sumOf { it.perimeter() }
    val whitesArea = figures.filter { it.color == colorWhite }.sumOf { it.area() }

    println("Сумма периметров всех черных фигур = $blacksPerimeter, сумма площадей всех белых фигур = $whitesArea")
}