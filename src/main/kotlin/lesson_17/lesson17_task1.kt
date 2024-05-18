package org.example.lesson_17

class QuizElement (question: String, answer: String) {

    val _question = question
        get() = field

    var _answer = answer
        get() = field
        set(value) {
            field = value
        }
}