package org.example.lesson_4

const val MIN_CREW = 55
const val RECOMMENDED_CREW = 70
const val MIN_FOOD_BOX = 50

fun main() {
    var isLiar = false
//  Запрашиваем наличие повреждений судна
    println("Большому кораблю — большое плавание!")
    println("Имеются ли у корабля повреждения? Введите Да/Нет")
    var userInput = readLine()?.lowercase()
    // Ну, задачка со здёвздочкой, так задачка со звёздочкой...
    val isDamaged = when (userInput) {
        "да" -> true
        "нет" -> false
        else -> {
            println("Ни да, ни нет. Значит, считаем, что корабль повреждён")
            false
        }
    }
//  Запрашиваем количество членов экипажа
    println("Каков текущий состав экипажа? Введите целое число:")
    var currentCrew = readLine()?.toIntOrNull()

    if (currentCrew == null) {
        println("Вы ввели некорректное значение. Считаем, что остаётся только капитан! Часть команды — часть корабля!")
        currentCrew = 1
    } else {
        if (currentCrew <= 0) {
            isLiar = true
            println("Так не бывает. Считаем, что остаётся только капитан! Часть команды — часть корабля!")
            currentCrew = 1
        } else if (currentCrew > RECOMMENDED_CREW) {
            println("И куда столько народу девать!?")
        } else if (currentCrew in MIN_CREW..RECOMMENDED_CREW) {
            println("Отлично")
        } else {
            println("Ну, это лучше, чем никого.")
        }
    }
// Запрашиваем количество провианта
    println("Сколько ящиков провизии на борту? Введите целое число: ")
    var foodBoxAvailable = readLine()?.toIntOrNull()
    if (foodBoxAvailable != null) {
        if (foodBoxAvailable <= 0 && isLiar) {
            println("И так тоже не бывает. Ящик спирта всегда есть. Оставим один ящик капитану")
            foodBoxAvailable = 1
        } else if (foodBoxAvailable <= 0) {
            println("Так не бывает. Ящик спирта всегда есть. Оставим один ящик капитану")
            foodBoxAvailable = 1
        } else {
            println("Ну, это лучше, чем ничего")
        }
    } else {
        println("Опять не то ввёл. Давай по новой")
        return
    }
// Запрашиваем метео
    println("Погода благоприятная? Да/Нет:")
    userInput = readLine()?.lowercase()
    val weatherIsGood = when (userInput) {
        "да" -> true
        "нет" -> false
        else -> {
            println("Ни да, ни нет. Ладно, посмотрим по остальным параметрам, шансы есть")
            false
        }
    }

    val isReadyToGo: Boolean = (!isDamaged && ((currentCrew ?: 0) in MIN_CREW..RECOMMENDED_CREW)
            && ((foodBoxAvailable ?: 0) > MIN_FOOD_BOX)) || (currentCrew == RECOMMENDED_CREW && ((foodBoxAvailable
        ?: 0) >= MIN_FOOD_BOX) && weatherIsGood)

    val readyToGo = if (isReadyToGo) {
        "Плывём!"
    } else {
        "Не плывём..."
    }

    println("Основываясь на предоставленной информации, могу с уверенностью сказать, что мы...")
    Thread.sleep(1000)
    print(".")
    Thread.sleep(1500)
    print("..")
    Thread.sleep(700)
    print(".......")
    Thread.sleep(420)
    println("..........")
    println(readyToGo)
}