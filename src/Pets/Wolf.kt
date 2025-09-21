package Pets

class Wolf(name: String) : Pet(name = name, maxHealth = 250, speed = 100) {
    override fun makeSound() {
        println("$name: воет")
    }

    override fun describe() {
        println("Волк $name: опасный и быстрый, охотится в стае (Здоровье: $maxHealth, Скорость: $speed)")
    }
}