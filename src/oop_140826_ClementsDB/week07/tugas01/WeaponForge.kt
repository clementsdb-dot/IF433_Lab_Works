package oop_140826_ClementsDB.week07.tugas01

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object Factory {
        fun forgeStarterSword(): Weapon {
            val item = GameItem(
                "Pedang Kayu Bapuk",
                5,
                ItemRarity.COMMON
            )
            return Weapon(item, 50)
        }

        fun forgeEpicSword(): Weapon {
            val item = GameItem(
                "Pedang Epik",
                100,
                ItemRarity.EPIC
            )
            return Weapon(item, 200)
        }
    }
}

