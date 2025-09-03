package org.example.lesson1

const val numberOfSecondsInAMinute = 60
const val numberOfMinutesInAnHour = 60

fun main(){

    var numberOfSecondsInSpace = 6480

    val numberOfMinutesInSpace = numberOfSecondsInSpace / numberOfSecondsInAMinute % numberOfMinutesInAnHour

    val numberOfFullHoursInSpace = numberOfSecondsInSpace / numberOfSecondsInAMinute / numberOfMinutesInAnHour

    numberOfSecondsInSpace %= numberOfSecondsInAMinute

    println("%02d:%02d:%02d".format(numberOfFullHoursInSpace, numberOfMinutesInSpace, numberOfSecondsInSpace))

}