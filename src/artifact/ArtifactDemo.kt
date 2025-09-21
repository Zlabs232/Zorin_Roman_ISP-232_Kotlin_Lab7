package artifact

fun main() {
    val sword = Weapon("Палка истины", 50, "Epic", "Огонь", isTwoHanded = false)
    val healPotion = Potion("Зелье исцеления", 30, "Common", effectDuration = 10, isConsumable = true)
    val relic = Relic("Реликвия Мопсярок", 100, "Rare", origin = "Демоническое", charges = 2)

    val items: List<MagicItem> = listOf(sword, healPotion, relic)

    for (item in items) {
        item.describe()
        println(item.use())
    }

}
