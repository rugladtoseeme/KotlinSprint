package org.example.lesson5

fun generateSecretNumbers(): MutableSet<Int> {
    val secretSet: MutableSet<Int> = mutableSetOf()
    do {
        secretSet.add((0..42).random())
    } while (secretSet.size < 3)
    return secretSet
}

fun enterNumbersSet(): MutableSet<Int> {

    val inputSet: MutableSet<Int> = mutableSetOf()
    do {
        println("Введите число от 0 до 42!")
        val enteredNumber = readln().toInt()
        if (inputSet.contains(enteredNumber)) {
            println("Необходимо вводить различные числа! Попробуйте еще раз")
            continue
        }
        if (enteredNumber !in 0..42) {
            println("Число не входит в диапазон [0, 42]. Попробуйте еще раз")
            continue
        }
        inputSet.add(enteredNumber)
    } while (inputSet.size < 3)
    return inputSet
}

fun main() {

    val secretNumbersSet = generateSecretNumbers()
    val inputNumbersSet = enterNumbersSet()
    val matchesCount = inputNumbersSet.intersect(secretNumbersSet).size

    println(
        when (matchesCount) {
            0 -> "Неудача! Вы не угадали ни одного числа."
            1 -> "Вы угадали одно число и выиграли утешительный приз!"
            2 -> "Поздравляем! Вы угадали два числа и выиграли крупный приз!"
            else -> "Поздравляем! Вы угадали все числа и выиграли джекпот!"
        }
    )

    print(secretNumbersSet.joinToString(", ", "Правильные ответы: ", "."))
}