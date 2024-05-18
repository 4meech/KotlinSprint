package org.example.lesson_17

fun main() {
    val folder = Folder("X-Files_Scully", 42, true)
    val folder2 = Folder("X-Files_Mulder", 42)

    println(folder.getName)
    println(folder2.getName)
}

class Folder (
    private var folderName: String,
    private var numberOfFiles: Int,
    private val isSecret: Boolean = false,
) {
    val getName: String
        get() {
            return if (isSecret) {
                "скрытая папка, файлов: 0"
            } else {
                "${this.folderName}, файлов: ${this.numberOfFiles}"
            }
        }
}