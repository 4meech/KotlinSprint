package org.example.lesson_5

fun main() {
    val username = "Zaphod"
    val password = "PanGalactic"
    print(
        """
        Во все двери на корабле программно заложена жизнерадостность,
        но всё равно они не откроются, если вам нельзя в них войти.
        Соблюдайте регистр, иначе мне придётся отвести вас в рубку для регистрации
        Введите имя: 
    """.trimIndent()
    )

    val userInput = readln()
    if (userInput.equals(username)) {
        print(
            """
            Вы $username. Это и так было очевидно, но такая вот у меня глупая работа.
            Ума планета, а меня тут вахтёром работать поставили... [вздыхает]
            Вы бы это... пароль ввели... и закончим с этим побыстрее.
            Жду, вводите: 
        """.trimIndent()
        )
        val passInput = readln()
        if (passInput.equals(password)) {
            println("Ура. Счастье. Знать бы ещё что это. Проходите.")
        } else {
            println("Печально это говорить, но давайте всё по новой")
        }
    } else {
        println(
            """
            Ситуация ещё более печальная, чем я предполагал.
            Вынужден отвести вас в рубку, опечалим дежурного офицера необходимостью регистрации.
            Всего вам грустного.
        """.trimIndent()
        )
        return
    }
}