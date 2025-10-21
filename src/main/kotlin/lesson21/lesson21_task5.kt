package org.example.lesson21

class Player() {
    val skills = mutableMapOf<String, Int>()

    fun addSkill(name: String, exp: Int) {
        skills.put(name, exp)
    }
}

fun Player.maxCategory() = skills.maxBy { it.value }.key

fun main() {

    val player = Player()
    player.addSkill("Магия", 3)
    player.addSkill("Стрельба", 5)
    player.addSkill("Фехтование", 2)
    player.addSkill("Алхимия", 6)
    player.addSkill("Харизма", 8)
    player.addSkill("Ловкость рук", 8)

    println("Ваш наилучший навык - это ${player.maxCategory()}")
}