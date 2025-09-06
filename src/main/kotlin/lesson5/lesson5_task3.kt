package org.example.lesson5

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    val secretNumber1 = Random.nextInt(42)
    var secretNumber2 = Random.nextInt(42)

    while (secretNumber2 == secretNumber1)
        secretNumber2 = Random.nextInt(42)

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