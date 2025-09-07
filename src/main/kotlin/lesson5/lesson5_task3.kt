package org.example.lesson5

fun main() {

    val secretNumber1 = (0..42).random()
    var secretNumber2 = (0..42).random()

    while (secretNumber2 == secretNumber1)
        secretNumber2 = (0..42).random()

    val secretList = listOf(secretNumber1,secretNumber2)
    println("Введите число от 0 до 42!")
    val inputNumber1 = readln().toInt()

    println("Введите число от 0 до 42!")
    val inputNumber2 = readln().toInt()

    val firstRight = if (secretList.contains(inputNumber1)) 1 else 0
    val secondRight = if (secretList.contains(inputNumber2)) 1 else 0
    val result = firstRight + secondRight

    println(
        if (result == 0) "Неудача!"
        else if (result == 1) "Вы выиграли утешительный приз!"
        else "Поздравляем! Вы выиграли главный приз!"
    )

    println("Правильные ответы: $secretNumber1, $secretNumber2")
}