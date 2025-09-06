package org.example.lesson5

fun main() {

    val secretNumber1 = 42
    val secretNumber2 = 10

    println("Введите число от 1 до 42!")
    val inputNumber1 = readln().toInt()

    println("Введите число от 1 до 42!")
    val inputNumber2 = readln().toInt()

    val strResult = if ((inputNumber1 == secretNumber1 && inputNumber2 == secretNumber2) ||
        (inputNumber2 == secretNumber1 && inputNumber1 == secretNumber2)
    )
        "Поздравляем! Вы выиграли главный приз!"
    else if ((inputNumber1 == secretNumber1 && inputNumber2 != secretNumber2) ||
        (inputNumber2 != secretNumber1 && inputNumber1 == secretNumber2) ||
        (inputNumber1 != secretNumber1 && inputNumber2 == secretNumber2) ||
        (inputNumber2 == secretNumber1 && inputNumber1 != secretNumber2)
    )
        "Вы выиграли утешительный приз!"
    else "Неудача!"

    println(strResult)
    println("Правильные ответы: $secretNumber1, $secretNumber2")


}