package transport

class Boat(name: String, speed: Int = 40, capacity: Int = 6) : Transport(name, speed, capacity) {
    override fun move() {
        println("$name плывет по воде")
    }

    override fun specialAbility() {
        println("$name может перевозить группу по рекам, морям и озерам")
    }
}