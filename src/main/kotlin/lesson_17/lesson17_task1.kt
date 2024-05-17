package org.example.lesson_17

class QuizElement (val question: String, val answer: String) {

    val questionGet: String = question
        get() = field

    var answerGetSet = answer
        get() = field
        set(value) {
            field = value
        }
}