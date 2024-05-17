package org.example.lesson_17

class QuizElement (val question: String, val answer: String) {

    val getQuestion = ""
        get() = field

    var getAnswer = ""
        get() = field
        set(value) {
            field = value
        }
}