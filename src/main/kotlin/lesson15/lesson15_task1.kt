package org.example.lesson15

abstract class Animal {
    abstract fun myName()
}

interface Flyable {
    fun fly()
}

interface Swimable {
    fun swim()
}

class Duck() : Animal(), Swimable, Flyable {
    override fun myName() {
        print("\nПривет, я утка!")
    }

    override fun swim() {
        print(" Я плыву!")
    }

    override fun fly() {
        print(" Я лечу!")
    }
}

class Seagull() : Animal(), Swimable, Flyable {
    override fun myName() {
        print("\nПривет, я чайка!")
    }

    override fun swim() {
        print(" Я плыву!")
    }

    override fun fly() {
        print(" Я лечу!")
    }
}

class Carp() : Animal(), Swimable {
    override fun myName() {
        print("\nПривет, я карась!")
    }

    override fun swim() {
        print(" Я плыву!")
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