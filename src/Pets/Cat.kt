package Pets

class Cat(name: String) : Pet(name = name, maxHealth = 150, speed = 80) {
    override fun makeSound() {
        println("$name: мяукает")
    }

    override fun describe() {
        println("Кот $name: тихий и ловкий (Здоровье: $maxHealth, Скорость: $speed)")
    }
}