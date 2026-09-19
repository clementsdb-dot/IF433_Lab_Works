package oop_140826_ClementsDB.week03

fun main() {
    val sword = Weapon("Excalibur", 600)

    // Coba set damage ke -50 (harus gagal)
    sword.damage = -50
    println("Damage setelah set -50: ${sword.damage}")

    // Coba set damage ke 9999 (harus jadi 1000)
    sword.damage = 9999
    println("Damage setelah set 9999: ${sword.damage}")

    // Print Tier
    println("Tier ${sword.name}: ${sword.tier}")
}