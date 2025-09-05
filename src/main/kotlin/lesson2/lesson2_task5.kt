package org.example.lesson2

import kotlin.math.pow

fun main() {

    var sumOfDeposit = 70000.0
    val interestRatePercent = 16.7
    val yearsOfDeposit = 20

    sumOfDeposit *= ((100 + interestRatePercent) / 100).pow(yearsOfDeposit)

    print(String.format("%.3f", sumOfDeposit))
}