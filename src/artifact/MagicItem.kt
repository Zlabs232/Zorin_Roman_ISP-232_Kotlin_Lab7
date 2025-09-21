package artifact

open class MagicItem(val name: String, val power: Int, val rarity: String) {
    open fun describe() {
        println("Артефакт: $name | Сила: $power | Редкость: $rarity")
    }

    open fun use(): String {
        return "Использует $name с силой $power"
    }
}
