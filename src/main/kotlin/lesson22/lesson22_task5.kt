package org.example.lesson22

import java.time.LocalDateTime

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: LocalDateTime? = null,
    val distanceToEarth: Double
)

fun main() {

    val guide =
        GalacticGuide(
            "Alpha Centauri",
            "Тройная звёздная система, ближайшая к Земле, расположенная в созвездии Центавра",
            distanceToEarth = 4.37
        )

    println("Место: ${guide.component1()}, ${guide.component2()}, расстояние до Земли: ${guide.component4()} св. лет")
}