package org.example.lesson4

fun main() {

    val todaysDayNumber = 5
    val isDayEven = todaysDayNumber % 2 == 0

    println(
        """
        Упражнения для рук:       ${!isDayEven}
        Упражнения для ног:       $isDayEven
        Упражнения для спины:  $isDayEven
        Упражнения для пресса: ${!isDayEven}
    """.trimIndent()
    )
}