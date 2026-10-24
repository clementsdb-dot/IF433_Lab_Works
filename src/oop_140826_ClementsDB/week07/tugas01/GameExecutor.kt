package oop_140826_ClementsDB.week07.tugas01

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> {
            println("Monster : ${event.monsterName}")
        }

        is LootDropped -> {
            println("Item : ${event.item.name}")
            println("Rarity : ${event.item.rarity}")
        }

        is GameOver -> {
            println("Game Over: ${event.reason}")
        }

        is SafeZone -> {
            println("You are in a safe zone.")
        }
    }
}