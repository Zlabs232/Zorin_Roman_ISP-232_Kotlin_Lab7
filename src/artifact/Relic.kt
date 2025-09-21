package artifact

class Relic(
    name: String,
    power: Int,
    rarity: String,
    val origin: String,
    var charges: Int
) : MagicItem(name, power, rarity) {

    override fun describe() {
        super.describe()
        println("Происхождение: $origin | Заряды: $charges")
    }

    override fun use(): String {
        return if (charges > 0) {
            charges--
            "Использована реликвия \"$name\" (происхождение: $origin). Осталось зарядов: $charges"
        } else {
            "Реликвия \"$name\" не имеет зарядов."
        }
    }
}
