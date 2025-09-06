package org.example.lesson5

import kotlin.random.Random

fun main() {

    val secretNumber1 = Random.nextInt(43)
    var secretNumber2 = Random.nextInt(43)

    while (secretNumber2 == secretNumber1)
        secretNumber2 = Random.nextInt(43)

    println("Введите число от 1 до 42!")
    val inputNumber1 = readln().toInt()

    println("Введите число от 1 до 42!")
    val inputNumber2 = readln().toInt()

    val firstRight = if (inputNumber1 == secretNumber1 || inputNumber1 == secretNumber2) 1 else 0
    val secondRight = if (inputNumber2 == secretNumber1 || inputNumber2 == secretNumber2) 1 else 0
    val result = firstRight + secondRight

    println(
        if (result == 0) "Неудача!"
        else if (result == 1) "Вы выиграли утешительный приз!"
        else "Поздравляем! Вы выиграли главный приз!"
    )

    println("Правильные ответы: $secretNumber1, $secretNumber2")
}