package org.example.lesson19

enum class Fish(var fishName: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Рыба-петушок"),
}

fun main() {
    print(
        "Вы можете добавить в аквариум следующие виды рыб: ${
            Fish.entries.map { it.fishName }.joinToString(", ", postfix = ".")
        }"
    )
}