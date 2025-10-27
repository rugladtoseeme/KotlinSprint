package org.example.lesson21

fun String.vowelCount() = this.count { "aeiou".contains(it, ignoreCase = true) }

fun main() {
    val str1 = "hello"
    val str2 = "hello wOrld"
    println("в строке $str1 - ${str1.vowelCount()} гласных")
    println("в строке $str2 - ${str2.vowelCount()} гласных")
}