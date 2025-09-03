package org.example.lesson2

import kotlin.math.pow

fun main() {

    var sumOfDeposit = 70000.0
    val interestRate = 0.167
    val yearsOfDeposit = 20

    val coeffPerYear = 1 + interestRate

    sumOfDeposit *= coeffPerYear.pow(yearsOfDeposit)

    print(String.format("%.3f", sumOfDeposit))
}