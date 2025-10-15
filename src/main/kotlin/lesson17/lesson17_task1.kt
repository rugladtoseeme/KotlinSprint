package org.example.lesson17

class QuizElement(question: String, answer: String = "") {

    var question: String = question
        get() = field

    var answer: String = answer
        get() = field
        set(value) {
            field = value.trim()
        }
}

fun main() {
    val quizElem = QuizElement("testQuestion")
    quizElem.answer = "   testAnswer "
    println("Элемент викторины: ${quizElem.question}, ${quizElem.answer}")
}