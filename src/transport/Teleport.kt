package transport

class Teleport(name: String, speed: Int = 999, capacity: Int = 1) : Transport(name, speed, capacity) {
    override fun move() {
        println("$name мгновенно перемещается в другое место")
    }

    override fun specialAbility() {
        println("$name: нужна мана для активации, мгновенное перемещение")
    }
}