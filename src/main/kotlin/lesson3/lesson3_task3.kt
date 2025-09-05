package org.example.lesson3

fun main() {

    val number = 9

    val one = 1
    val two = 2
    val three = 3
    val four = 4
    val five = 5
    val six = 6
    val seven = 7
    val eight = 8
    val nine = 9

    val multiplicationTableText = """
        $number * 1 = ${number * one}
        $number * 2 = ${number * two}
        $number * 3 = ${number * three}
        $number * 4 = ${number * four}
        $number * 5 = ${number * five}
        $number * 6 = ${number * six}
        $number * 7 = ${number * seven}
        $number * 8 = ${number * eight}
        $number * 9 = ${number * nine}
    """.trimIndent()

    println(multiplicationTableText)
}