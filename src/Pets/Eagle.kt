package Pets

class Eagle(name: String) : Pet(name = name, maxHealth = 50, speed = 250) {
    override fun makeSound() {
        println("$name: кричит")
    }

    override fun describe() {
        println("Орёл $name: гордый и зоркий, парит высоко в небе (Здоровье: $maxHealth, Скорость: $speed)")
    }
}