package org.example.lesson7

private const val MIN_NUMBER = 1000
private const val MAX_NUMBER = 9999

fun main() {

    do {
        val codeGenerated = (MIN_NUMBER..MAX_NUMBER).random()
        println("Ваш код для входа: $codeGenerated")
        println("Введите код")
        val codeInput = readln().toInt()
        val isCodeNotCorrect = codeInput != codeGenerated
        if (isCodeNotCorrect) {
            println("Неверный код! Попробуйте снова, мы вышлем вам код повторно.")
        } else {
            println("Код верный. Добро подаловать в приложение!")
            return
        }
    } while (isCodeNotCorrect)

}