package org.example.lesson_15

const val PASSENGER_CAR_NUMBER_OF_SEATS = 3
const val CARGO_CAR_MAX_WEIGHT = 2
const val CARGO_CAR_MAX_NUMBER_OF_SEATS = 1

fun main() {
    val passengerCar = PassengerCar(PASSENGER_CAR_NUMBER_OF_SEATS, 0)
    val cargoCar = CargoCar(CARGO_CAR_MAX_NUMBER_OF_SEATS, CARGO_CAR_MAX_WEIGHT)

    passengerCar.move()
    passengerCar.loadPassengers(4)
    passengerCar.movePassengers()
    passengerCar.unloadPassengers()
    passengerCar.loadPassengers(2)
    passengerCar.movePassengers()
    passengerCar.unloadPassengers()
    passengerCar.loadCargo(1)
    println("-----------------------------------------------")
    cargoCar.move()
    cargoCar.loadPassengers(3)
    cargoCar.movePassengers()
    cargoCar.unloadPassengers()
    println()
    cargoCar.loadCargo(6)
    cargoCar.moveCargo()
    cargoCar.unloadCargo()

    val totalPassengersMoved = passengerCar.passengersMoved + cargoCar.passengersMoved

    println("————————————————————————————————————————————————————")
    println("Всего перевезено пассажиров: $totalPassengersMoved чел.")
    println("Всего перевезено груза: ${cargoCar.cargoMoved} т.")
}

abstract class Vehicle(val maxPassengers: Int, val maxCargo: Int) : CargoCarrier, PassengerCarrier {
    var passengersToMove = 0
    var cargoToMove = 0
    var passengersOnBoard = 0
    var cargoOnBoard = 0
    var passengersMoved = 0
    var cargoMoved = 0
}

interface PassengerCarrier {
    fun loadPassengers(number: Int)
    fun unloadPassengers()
    fun movePassengers()
}

interface CargoCarrier {
    fun loadCargo(number: Int)
    fun unloadCargo()
    fun moveCargo()
}

interface Moveable {
    fun move()
}

class PassengerCar(maxPassengers: Int, maxCargo: Int) : Vehicle(maxPassengers, maxCargo), Moveable {
    override fun move() {
        println("Приехала легковая машина")
    }

    override fun loadPassengers(number: Int) {
        if (passengersToMove + number <= maxPassengers) {
            passengersToMove += number
            passengersOnBoard = passengersToMove
            println("В легковую машину сели $passengersOnBoard пассажира")
        } else {
            println("$number чел. не влезут. Перевозится максимально возможное количество пассажиров: $maxPassengers.")
            passengersOnBoard = maxPassengers
        }
    }

    override fun movePassengers() {
        println("Легковая машина перевозит $passengersOnBoard пассажиров")
    }

    override fun unloadPassengers() {
        println("Высаживаю $passengersOnBoard пассажиров из легковой машины")
        passengersMoved += passengersOnBoard
    }


    override fun loadCargo(number: Int) {
        println("Легковая машина не может перевозить груз")
    }

    override fun unloadCargo() {
    }

    override fun moveCargo() {
    }
}

class CargoCar(maxPassengers: Int, maxCargo: Int) : Vehicle(maxPassengers, maxCargo), Moveable {
    override fun move() {
        println("Приехала грузовая машина")
    }

    override fun loadPassengers(number: Int) {
        if (passengersToMove + number <= maxPassengers) {
            passengersToMove += number
            passengersOnBoard = passengersToMove
        } else {
            println("$number чел. не влезут. Перевозится максимально возможное количество пассажиров: $maxPassengers.")
            passengersOnBoard = maxPassengers
        }
    }

    override fun unloadPassengers() {
        println("Высаживаю $passengersOnBoard пассажира из грузовой машины")
        passengersMoved += passengersOnBoard
    }

    override fun movePassengers() {
        println("Грузовая машина перевозит $passengersOnBoard пассажира")
    }

    override fun loadCargo(number: Int) {
        if (cargoToMove + number <= maxCargo) {
            cargoToMove += number
            cargoOnBoard = cargoToMove
        } else {
            println("$number т. - перевес. Загружено максимально возможное количество: $maxCargo т.")
            cargoOnBoard = maxCargo
        }
        println("Грузовая машина загрузила $cargoOnBoard т.")
    }

    override fun moveCargo() {
        println("Грузовая машина перевозит $cargoOnBoard т. груза")
    }

    override fun unloadCargo() {
        println("Разгружаю $cargoOnBoard т. груза")
        cargoMoved += cargoOnBoard
    }
}

