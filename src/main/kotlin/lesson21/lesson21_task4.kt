package org.example.lesson21

import java.io.File

fun File.writeWordToFile(word: String) {
    val existingContent = if (exists()) readText() else ""
    writeText(word.lowercase() + '\n' + existingContent)
}

fun main() {
    val file = File("example.txt")
    file.createNewFile()
    file.writeWordToFile("World")
    file.writeWordToFile("hEllo")
}