package world

class SpecialOperation(
    title: String,
    reward: Int,
    val requiredClearance: Int,
    val isCovert: Boolean
) : Mission(title, reward) {

    fun showReward() {
        println("Требуемый допуск: $requiredClearance")
        println("Режим секретности: ${if (isCovert) "Совершенно секретно" else "Обычный"}")
    }
}