fun main() {
    val harp = Instrument("Гусли", 8)
    val strings = Accessories("Набор струн для гуслей",15)

    harp.searchAcc(harp)
}

class Instrument (val name: String, val quantity: Int) : Searchable

class Accessories (val name: String, val quantity: Int)

interface Searchable {
    fun searchAcc(instrument: Instrument) {
        println("Выполняется поиск аксессуаров для '${instrument.name}...")
    }
}