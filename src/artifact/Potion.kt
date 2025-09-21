package artifact

class Potion(
    name: String,
    power: Int,
    rarity: String,
    val effectDuration: Int,
    val isConsumable: Boolean
) : MagicItem(name, power, rarity) {

    override fun describe() {
        super.describe()
        println("Длительность эффекта: ${effectDuration}s | Одноразовое: ${if (isConsumable) "да" else "нет"}")
    }

    override fun use(): String {
        return if (isConsumable) {
            "Выпито одноразовое зелье \"$name\": эффект $power на $effectDuration секунд"
        } else {
            "Применено многоразовое зелье \"$name\": эффект $power на $effectDuration секунд"
        }
    }
}
