package transport

fun main() {
    val transports = listOf<Transport>(
        Horse("Лулумбек"),
        Dragon("Дрогон", speed = 150),
        Boat("Dexter Morgan's boat"),
        Teleport("Тек телепорт"),
        Horse("Чухан", speed = 70, capacity = 1)
    )

    println("Система транспорта:")

    for (transport in transports) {
        transport.describe()
        transport.move()
        transport.specialAbility()
    }
}