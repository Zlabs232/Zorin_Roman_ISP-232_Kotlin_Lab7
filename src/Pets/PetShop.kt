package Pets

fun main() {
    val pets = listOf(
        Wolf(name = "Фенрир"),
        Cat(name = "Мурзик"),
        Eagle(name = "Скайвинд"),
        Bear(name = "Балу")
    )

    for (pet in pets) {
        pet.describe()
        pet.makeSound()
        println()
    }

    val pets2 = listOf(
        Wolf(name = "Фенрир"),
        Cat(name = "Мурзик"),
        Eagle(name = "Скайвинд"),
        Bear(name = "Балу")
    )

    println("Информация о питомцах:")
    for (pet in pets2) {
        pet.describe()
        pet.makeSound()
        println()
    }
}