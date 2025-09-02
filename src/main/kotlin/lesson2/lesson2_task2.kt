package org.example.lesson2

fun main(){

    val salariesForPermanentEmployees = 30000 * 50
    val salariesIncludingTrainees = salariesForPermanentEmployees + 30 * 20000
    val averageSalaryIncludingTrainees = salariesIncludingTrainees / 80

    println(salariesForPermanentEmployees)
    println(salariesIncludingTrainees)
    println(averageSalaryIncludingTrainees)
}