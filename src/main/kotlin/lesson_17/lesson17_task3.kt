package org.example.lesson_17

fun main() {
    val folder = Folder("X-Files_Scully", 42, true)
    val folder2 = Folder("X-Files_Mulder", 42)

    println("${folder.folderName}, файлов: ${folder.numberOfFiles}")
    println("${folder2.folderName}, файлов: ${folder2.numberOfFiles}")
}

class Folder(
    private var _folderName: String,
    private var _numberOfFiles: Int,
    private val isSecret: Boolean = false,
) {
    val folderName: String
        get() = if (isSecret) "Скрытая папка"
                else "Имя папки: ${this._folderName}"

    val numberOfFiles: Int
        get() = if (isSecret) 0
                else this._numberOfFiles
}