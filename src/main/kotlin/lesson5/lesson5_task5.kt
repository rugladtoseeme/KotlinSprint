package org.example.lesson5

fun generateNumber(): Int {
    return (0..42).random()
}

fun enterNumber(): Int {
    println("Введите число от 0 до 42!")
    return readln().toInt()
}

fun main() {

    val secretNumber1 = generateNumber()
    var secretNumber2 = generateNumber()
    while (secretNumber2 == secretNumber1)
        secretNumber2 = generateNumber()

    var secretNumber3 = generateNumber()

    while (secretNumber3 == secretNumber1 || secretNumber3 == secretNumber2)
        secretNumber3 = generateNumber()

    val secretList = listOf(secretNumber1, secretNumber2, secretNumber3)

    val inputNumber1 = enterNumber()

    val inputNumber2 = enterNumber()

    val inputNumber3 = enterNumber()

    val inputList = listOf(inputNumber1, inputNumber2, inputNumber3)

    val rightAnswersListSize = inputList.intersect(secretList).size

    println(
        when (rightAnswersListSize) {
            0 -> "Неудача! Вы не угадали ни одного числа."
            1 -> "Вы угадали одно число и выиграли утешительный приз!"
            2 -> "Поздравляем! Вы угадали два числа и выиграли крупный приз!"
            3 -> "Поздравляем! Вы угадали все числа и выиграли джекпот!"
            else -> "Поздравляем! Вы угадали все числа и выиграли джекпот!"
        }
    )

    println("Правильные ответы: $secretNumber1, $secretNumber2, $secretNumber3")
}