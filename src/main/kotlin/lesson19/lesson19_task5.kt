package org.example.lesson19

private const val MAX_PEOPLE_IN_LIST = 5

class PersonCards {
    private val people: MutableList<Person> = mutableListOf()
    private var canAdd = true

    fun addPerson(name: String, sex: Sex) {
        if (!canAdd) println("Добавлять на эту страницу больше нельзя.")
        else {
            if (people.size <= MAX_PEOPLE_IN_LIST) {
                people.add(Person(people.size + 1, name, sex))
                if (people.size == 5) {
                    printList()
                    canAdd = false
                }
            }
        }
    }

    private fun printList() {
        println("Список людей в картотеке:\n${people.joinToString("\n", postfix = ".")}")
    }
}

class Person(val id: Int, val name: String, val sex: Sex) {
    override fun toString() = "$id, Имя: $name, пол: ${sex.sexStr}"
}

enum class Sex(val sexStr: String) {
    MALE("Мужской"),
    FEMALE("Женский"),
    UNKNOWN("Неизвестно")
}

fun addPersonToCards(cards: PersonCards) {
    println("Введите фамилию и имя с большой буквы:")
    val name = readln()
    println("Введите пол:")
    val sexStr = readln()
    cards.addPerson(
        name, when {
            sexStr.equals("Женский", ignoreCase = true)
                -> Sex.FEMALE

            sexStr.equals("Мужской", ignoreCase = true)
                -> Sex.MALE

            else -> Sex.UNKNOWN
        }
    )
}

fun main() {
    println("Заполните фамилию, имя и пол для 5 человек.")
    println("Вводите имя и фамилию с большой буквы, пол - без сокращений.")
    println("Доступные варианты пола: ${Sex.entries.map { it.sexStr }.joinToString(", ", postfix = ".")}")
    val cards = PersonCards()
    for (i in 0..MAX_PEOPLE_IN_LIST) {
        addPersonToCards(cards)
    }
}