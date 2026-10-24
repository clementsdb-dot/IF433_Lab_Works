package oop_140826_ClementsDB.week07.tugas01

fun main () {
    GameManager.startGame()
    GameManager.startGame()

    println("Legendary Drop Chance: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()

    println("Senjata awal: ${starterWeapon.item.name}")
    println("Damage awal: ${starterWeapon.item.damage}")

    val upgradedItem = starterWeapon.item.copy(damage = 25)

    println("Senjata setelah upgrade: ${upgradedItem.name}")
    println("Damage setelah upgrade: ${upgradedItem.damage}")
    processEvent(SafeZone)
    processEvent(MonsterEncounter("Goblin Nakal"))
    processEvent(LootDropped(upgradedItem))
    processEvent(GameOver("Terkena jebakan racun"))
}