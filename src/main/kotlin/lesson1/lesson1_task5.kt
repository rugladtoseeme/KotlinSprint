package org.example.lesson1

import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun main(){

    var numberOfSecondsInSpace = 6480

    var numberOfFullMinutesInSpace = numberOfSecondsInSpace / 60

    numberOfSecondsInSpace %= 60

    val numberOfFullHoursInSpace = numberOfFullMinutesInSpace / 60

    numberOfFullMinutesInSpace %= 60

    println(LocalTime.of(numberOfFullHoursInSpace, numberOfFullMinutesInSpace, numberOfSecondsInSpace).format(DateTimeFormatter.ISO_LOCAL_TIME))

}