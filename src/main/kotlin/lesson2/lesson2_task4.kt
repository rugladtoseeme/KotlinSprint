package org.example.lesson2

import kotlin.math.floor

fun main() {

    val buffCoeff = 0.2
    val resourceCrystalAmountRaw = 7
    val resourceIronAmountRaw = 11

    val resourceCrystalAmountBuffed = floor(resourceCrystalAmountRaw * (buffCoeff)).toInt()
    val resourceIronAmountBuffed = floor(resourceIronAmountRaw * (buffCoeff)).toInt()

    println("получено $resourceCrystalAmountBuffed бонусных единиц кристаллической руды!")
    println("получено $resourceIronAmountBuffed бонусных единиц железной руды!")
}