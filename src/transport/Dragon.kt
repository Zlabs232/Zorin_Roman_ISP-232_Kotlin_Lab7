package transport

class Dragon(name: String, speed: Int = 120, capacity: Int = 3) : Transport(name, speed, capacity) {
    override fun move() {
        println("$name летит высоко над землей")
    }

    override fun specialAbility() {
        println("$name дышит огнём и перевозит персонжаа по воздуху")
    }
}