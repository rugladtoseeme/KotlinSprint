package org.example.lesson17

class Folder(name: String, val isSecret: Boolean, numberOfFiles: Int) {

    var name: String = name
        get() =
            if (isSecret) {
                "скрытая папка"
            } else name

    var numberOfFiles: Int = numberOfFiles
        get() = if (isSecret) {
            0
        } else numberOfFiles
}

fun main() {
    val secretFolder = Folder("Новая папка1", isSecret = true, numberOfFiles = 10)
    println("Имя папки: ${secretFolder.name}, количество файлов в папке: ${secretFolder.numberOfFiles}")
}