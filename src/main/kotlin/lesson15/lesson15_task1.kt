package org.example.lesson15

abstract class Animal {
    abstract fun myName()
}

interface Flyable {
    fun fly() {
        print(" Я лечу!")
    }
}

interface Swimable {
    fun swim() {
        print(" Я плыву!")
    }
}

class Duck() : Animal(), Swimable, Flyable {
    override fun myName() {
        print("\nПривет, я утка!")
    }
}

class Seagull() : Animal(), Swimable, Flyable {
    override fun myName() {
        print("\nПривет, я чайка!")
    }
}

class Carp() : Animal(), Swimable {
    override fun myName() {
        print("\nПривет, я карась!")
    }
}

fun main() {

    val animals = listOf<Animal>(Carp(), Duck(), Seagull())

    for (animal in animals) {
        animal.myName()
        if (animal is Flyable) animal.fly()
        if (animal is Swimable) animal.swim()
    }
}