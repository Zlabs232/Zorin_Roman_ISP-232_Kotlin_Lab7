package Pets

open class Pet(
    val name: String,
    val maxHealth: Int,
    val speed: Int
) {
    open fun describe() {
        println("Питомец: $name, Здоровье: $maxHealth, Скорость: $speed")
    }

    open fun makeSound() {
        println("$name подаёт голос.")
    }
}