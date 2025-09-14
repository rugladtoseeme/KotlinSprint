package org.example.lesson8

fun main() {

    val viewsForOneWeekDaily = arrayOf(1, 4, 7, 6, 2, 9, 5)
    var totalViewsForAWeek = 0
    for (i in viewsForOneWeekDaily) {
        totalViewsForAWeek += i
    }
    println("Всего за неделю было $totalViewsForAWeek просмотром рекламы.")
}