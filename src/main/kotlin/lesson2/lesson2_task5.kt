package org.example.lesson2

fun main(){

    var sumOfDeposit = 70000.0
    val interestRate = 0.167
    val yearsOfDeposit = 20

    for (i in 1 .. yearsOfDeposit){
        sumOfDeposit *= (1+interestRate)
    }

    print(String.format("%.3f", sumOfDeposit))
}