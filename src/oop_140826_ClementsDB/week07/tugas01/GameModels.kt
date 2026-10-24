package oop_140826_ClementsDB.week07.tugas01

enum class ItemRarity(val dropChance: Int) {
    COMMON(70), UNCOMMON(20), RARE(9), EPIC(5), LEGENDARY(1)
}

data class Rarity(val name: String, val damage: Int, val rarity: ItemRarity)