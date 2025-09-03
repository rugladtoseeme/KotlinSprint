package org.example.lesson2

import kotlin.math.floor

fun main() {

    val buffPercents = 20
    val resourceCrystalAmountRaw = 7
    val resourceIronAmountRaw = 11

    val resourceCrystalAmountBuffed = floor(resourceCrystalAmountRaw * 1.0 / 100 * buffPercents).toInt()
    val resourceIronAmountBuffed = floor(resourceIronAmountRaw * 1.0 / 100 * buffPercents).toInt()

    println("получено $resourceCrystalAmountBuffed бонусных единиц кристаллической руды!")
    println("получено $resourceIronAmountBuffed бонусных единиц железной руды!")
}