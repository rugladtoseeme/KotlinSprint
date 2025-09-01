package org.example.lesson1

fun main() {
    /*Расстояние 40_868_600_000
    Возраст – 27
    Часть дня – 0.075
    Секунды – 6480
    Часть года – 2.0547945205479453E-4
    Апогей орбиты – 327000

    – length –расстояние, которое пролетел Гагарин пока был в космосе в миллиметрах;
 – age – возраст Гагарина на момент полета (целых лет);
 – partOfDay – какую часть дня Гагарин провел в космосе;
 – seconds – количество секунд которое Гагарин провел в космосе;
 – partOfYear – какую часть года Гагарин провел в космосе;
 – apogee – апогей орбиты Гагарина в метрах.*/

    val length: Long = 40_868_600_000
    val age: Byte = 27
    val partOfDay: Float = 0.075f
    val seconds: Short = 6480
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: Int = 327000

    println(length)
    println(age)
    println(partOfDay)
    println(seconds)
    println(partOfYear)
    println(apogee)
}