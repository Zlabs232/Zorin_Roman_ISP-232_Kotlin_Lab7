package transport

open class Transport(
    val name: String,
    val speed: Int,
    val capacity: Int
) {
    open fun describe() {
        println("Транспорт: $name, Скорость: $speed, Вместимость: $capacity персонажей")
    }

    open fun move() {
        println("$name двигается")
    }

    open fun specialAbility() {
        println("$name имеет особую способность")
    }
}