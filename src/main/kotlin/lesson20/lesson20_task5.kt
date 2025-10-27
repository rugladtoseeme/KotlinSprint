package org.example.lesson20

class Robot(val phrasesList: List<String>) {

    var modifier: (String) -> String = { it }

    fun say() {
        println(modifier(phrasesList[(0..phrasesList.size).random()]))
    }

    fun setStringModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}

fun main() {
    val robot = Robot(listOf("hi!", "hello!", "goodbye!", "what's your name?", "how are you?"))
    robot.say()
    robot.setStringModifier { it.reversed() }
    robot.say()
}