package org.example.lesson4

fun main() {

    val isFirstDayTrainingArmsAndPress = true

    val todaysDayNumber = 5
    val numberOfVariants = 2

    val isTodayAnArmsAndPressDay = (todaysDayNumber % numberOfVariants == 1) == isFirstDayTrainingArmsAndPress

    println(
        """
        Упражнения для рук:       $isTodayAnArmsAndPressDay
        Упражнения для ног:       ${!isTodayAnArmsAndPressDay}
        Упражнения для спины:  ${!isTodayAnArmsAndPressDay}
        Упражнения для пресса: $isTodayAnArmsAndPressDay
    """.trimIndent()
    )
}