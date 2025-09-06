package org.example.lesson4

const val ALL_TABLES_AMOUNT = 13

fun main() {

    val tablesReservedToday = ALL_TABLES_AMOUNT
    val tablesReservedTomorrow = 9

    println("Доступность столиков на сегодня: ${tablesReservedToday < ALL_TABLES_AMOUNT}")
    println("Доступность столиков на завтра: ${tablesReservedTomorrow < ALL_TABLES_AMOUNT}")
}