package org.example.lesson18

abstract class TamagochiPet(val name: String) {
    abstract fun eat()
    fun sleep() {
        println("$name -> спит")
    }
}

class FoxPet(name: String) : TamagochiPet(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class DogPet(name: String) : TamagochiPet(name) {
    override fun eat() {
        println("$name -> ест кость")
    }
}

class CatPet(name: String) : TamagochiPet(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}

fun main() {

    val petList = listOf<TamagochiPet>(FoxPet("liza"), CatPet("tomas"), DogPet("bernard"))
    petList.forEach {
        it.eat()
    }
}