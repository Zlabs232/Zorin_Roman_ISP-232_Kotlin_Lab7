package transport

class Horse(name: String, speed: Int = 60, capacity: Int = 2) : Transport(name, speed, capacity) {
    override fun describe() {
        println("Скакун: $name, Скорость: $speed, Вместимость: $capacity персонажей")
    }

    override fun move() {
        println("$name скачет по равнинам")
    }

    override fun specialAbility() {
        println("$name может ускориться в бою")
    }
}