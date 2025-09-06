package org.example.lesson4

fun main() {

    val isFirstDayTrainingArmsAndPress = true

    val todaysDayNumber = 5
    val isDayEven = todaysDayNumber % 2 == 0


    println(
        """
        Упражнения для рук:       ${isDayEven != isFirstDayTrainingArmsAndPress}
        Упражнения для ног:       ${isDayEven == isFirstDayTrainingArmsAndPress}
        Упражнения для спины:  ${isDayEven == isFirstDayTrainingArmsAndPress}
        Упражнения для пресса: ${isDayEven != isFirstDayTrainingArmsAndPress}
    """.trimIndent()
    )
}