package org.example.lesson15

abstract class Product(val name: String, val amount: Int) {
    override fun toString(): String {
        return "$name, $amount штук"
    }
}

interface Searchable {
    fun findComponents(components: List<InstrumentComponent>): List<InstrumentComponent>
}

class Instrument(name: String, amount: Int) : Product(name, amount), Searchable {

    override fun findComponents(components: List<InstrumentComponent>): List<InstrumentComponent> {
        println("Выполняется поиск.")
        return components.filter { it.instrument.name == name }
    }
}

class InstrumentComponent(name: String, amount: Int, val instrument: Instrument) : Product(name, amount)

fun main() {

    val violin = Instrument("скрипка", 6)
    val guitar = Instrument("гитара", 10)
    val components = listOf(
        InstrumentComponent("гитарные струны", 15, guitar),
        InstrumentComponent("скрипичные струны", 10, violin),
        InstrumentComponent("гитарный чехол", 5, guitar),
        InstrumentComponent("футляр для скрипки", 3, violin),
        InstrumentComponent("медиатор", 50, guitar),
        InstrumentComponent("смычок", 15, violin)
    )

    val violinComponents = violin.findComponents(components)
    val guitarComponents = guitar.findComponents(components)

    println("Товары для гитары: ${guitarComponents.joinToString("; ", postfix = ".")}")
    println("Товары для скрипки: ${violinComponents.joinToString("; ", postfix = ".")}")
}