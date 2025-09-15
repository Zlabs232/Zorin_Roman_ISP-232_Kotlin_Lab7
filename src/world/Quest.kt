package world

class Quest(
    title: String,
    val duration: Int,
    reward: Int,
    val difficulty: String
) : Mission(title, reward) {

    fun printInfo() {
        println("Название квеста: $title")
        println("Время выполнения: $duration часов")
        println("Награда: $reward монет")
        println("Уровень сложности: $difficulty")
    }

    fun isHard(): Boolean {
        return difficulty.lowercase() == "сложный"
    }

    fun goldPerHour(): Double {
        return reward.toDouble() / duration
    }
}