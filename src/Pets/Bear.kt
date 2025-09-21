package Pets

class Bear(name: String) : Pet(name = name, maxHealth = 550, speed = 50) {
    override fun makeSound() {
        println("$name: рычит")
    }

    override fun describe() {
        println("Медведь $name: сильный и мощный, хозяин леса (Здоровье: $maxHealth, Скорость: $speed)")
    }
}