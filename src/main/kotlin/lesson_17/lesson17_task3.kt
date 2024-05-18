package org.example.lesson_17

fun main() {
    val folder = Folder("X-Files_Scully", 42, true)
    val folder2 = Folder("X-Files_Mulder", 42)

    println(folder.getName)
    println(folder2.getName)
}

class Folder (
    var folderName: String,
    var numberOfFiles: Int,
    val isSecret: Boolean = false,
) {
    val getName: String
        get() {
            return if (isSecret) {
                this.numberOfFiles = 0
                "скрытая папка, файлов: ${numberOfFiles}"
            } else {
                "${this.folderName}, файлов: ${this.numberOfFiles}"
            }
        }
}