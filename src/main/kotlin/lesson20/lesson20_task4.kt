package org.example.lesson20

fun main() {

    val list = listOf<String>("str1", "str2", "str3", "str4", "str5", "str6", "str7")

    val convertStrings: List<() -> Unit> =
        list.map { fun() = println("Нажат элемент [$it]") }.filterIndexed { index, _ -> index % 2 == 1 }

    for (lambda in convertStrings){
        lambda()
    }
}