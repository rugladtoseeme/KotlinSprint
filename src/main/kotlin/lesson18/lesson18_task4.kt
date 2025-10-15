package org.example.lesson18

import kotlin.math.pow

abstract class Box(val width: Double) {
    abstract fun surfaceArea(): Double
}

class SquareBox(width: Double) : Box(width) {
    override fun surfaceArea() = width.pow(2) * 6
}

class RectangleBox(width: Double, val height: Double, val length: Double) : Box(width) {
    override fun surfaceArea() = (width * height + width * length + height * length) * 2
}

fun main() {
    val boxes = listOf<Box>(SquareBox(1.0), RectangleBox(1.0, 2.0, 3.0))
    boxes.forEach {
        println("площадь поверхности коробки = ${it.surfaceArea()}")
    }
}