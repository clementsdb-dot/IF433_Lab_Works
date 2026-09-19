package oop_140826_ClementsDB.week03

import oop_01_ClementsDB.week03.Weapon

fun main(weapon: Weapon) {
    val sword = Weapon("Excalibur", 600)

    sword.damage = -50
    println("Damage setelah set -50: ${sword.damage}")

    sword.damage = 9999
    println("Damage setelah set 9999: ${sword.damage}")

    println("Tier ${sword.name}: ${sword.tier}")
}