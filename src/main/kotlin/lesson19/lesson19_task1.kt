package org.example.lesson19

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun main() {
    println("Вы можете добавить в аквариум следующие виды рыб: ${Fish.entries.joinToString(", ", postfix = ".")}")
}