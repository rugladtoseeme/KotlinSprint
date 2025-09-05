package org.example.lesson2

fun main() {

    val employeeSalary = 30000
    val numberOfEmployees = 50
    val traineeSalary = 20000
    val numberOfTrainees = 30
    val numberOfAllWorkers = 80

    val salariesForPermanentEmployees = employeeSalary * numberOfEmployees
    val salariesIncludingTrainees = salariesForPermanentEmployees + traineeSalary * numberOfTrainees
    val averageSalaryIncludingTrainees = salariesIncludingTrainees / numberOfAllWorkers

    println(salariesForPermanentEmployees)
    println(salariesIncludingTrainees)
    println(averageSalaryIncludingTrainees)
}