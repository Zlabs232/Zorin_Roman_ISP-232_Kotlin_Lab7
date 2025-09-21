package artifact

class Weapon(
    name: String,
    power: Int,
    rarity: String,
    val damageType: String,
    val isTwoHanded: Boolean
) : MagicItem(name, power, rarity) {

    override fun describe() {
        super.describe()
        println("Тип урона: $damageType | Двуручное: ${if (isTwoHanded) "да" else "нет"}")
    }

    override fun use(): String {
        return "Наносит $damageType урон силой $power"
    }
}
