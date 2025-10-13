package org.example.lesson18

abstract class Figure

class Circle: Figure(){
    override fun toString() = "круг"
}

class Square: Figure(){
    override fun toString() = "квадрат"
}

class Point: Figure(){
    override fun toString() = "точка"
}

class Screen(){

    fun drawFigure(x: Int, y: Int, figure: Figure): String{
       return "Нарисована фигура: $figure на координатах: ($x, $y)"
    }

    fun drawFigure(x: Float, y: Float, figure: Figure): String{
        return "Нарисована фигура: $figure на координатах: ($x, $y)"
    }

    fun drawFigure(x: Int, y: Float, figure: Figure): String{
        return "Нарисована фигура: $figure на координатах: ($x, $y)"
    }

    fun drawFigure(x: Float, y: Int, figure: Figure): String{
        return "Нарисована фигура: $figure на координатах: ($x, $y)"
    }
}

fun main() {

    val screen = Screen()
    println(screen.drawFigure(1, 5, Circle()))
    println(screen.drawFigure(1.0f, 5, Circle()))
    println(screen.drawFigure(1, 5.7f, Point()))
    println(screen.drawFigure(1.3f, 5.7f, Square()))
}