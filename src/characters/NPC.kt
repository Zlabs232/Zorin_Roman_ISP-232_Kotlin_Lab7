package characters

class NPC(
    name: String,
    hp: Int,
    element: String,
    val faction: String,
    val hasQuest: Boolean
) : GameCharacter(name, hp, element) {

    fun giveQuest() {
        println("$name выдает квест")
    }

    fun trade() {
        println("$name торгует")
    }
}