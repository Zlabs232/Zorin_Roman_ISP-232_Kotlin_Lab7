package world

fun main() {
    val contract1 = Contract(
        "Охота на гоблинов",
        "Чухан Элрик",
        "Охотиться на гоблинов в лесу",
        500,
        true
    )

    val contract2 = Contract(
        "Доставка товара",
        "Мопс Альберт",
        "Доставить товар в соседний город",
        300
    )

    contract1.printContractInfo()
    println()
    contract2.printContractInfo()
}