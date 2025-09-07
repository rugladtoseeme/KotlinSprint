package org.example.lesson5

fun main() {

    val secretNumber1 = (0..42).random()
    var secretNumber2 = (0..42).random()
    while (secretNumber2 == secretNumber1)
        secretNumber2 = (0..42).random()

    var secretNumber3 = (0..42).random()

    while (secretNumber3 == secretNumber1 || secretNumber3 == secretNumber2)
        secretNumber3 = (0..42).random()

    val secretList = listOf(secretNumber1, secretNumber2, secretNumber3)

    println("Введите число от 0 до 42!")
    val inputNumber1 = readln().toInt()

    println("Введите число от 0 до 42!")
    val inputNumber2 = readln().toInt()

    println("Введите число от 0 до 42!")
    val inputNumber3 = readln().toInt()

    val inputList = listOf(inputNumber1, inputNumber2, inputNumber3)

    val rightAnswersListSize = inputList.intersect(secretList).size

    println(
        if (rightAnswersListSize == 0) "Неудача! Вы не угадали ни одного числа."
        else if (rightAnswersListSize == 1) "Вы угадали одно число и выиграли утешительный приз!"
        else if (rightAnswersListSize == 2) "Поздравляем! Вы угадали два числа и выиграли крупный приз!"
        else "Поздравляем! Вы угадали все числа и выиграли джекпот!"
    )

    println("Правильные ответы: $secretNumber1, $secretNumber2, $secretNumber3")
}