package oop_01_ClementsDB.week02

import java.util.Scanner
import kotlin.random.Random

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan nama Hero: ")
    val name = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val baseDamage = scanner.nextInt()

    val hero = Hero(name, baseDamage)
    var enemyHp = 100

    println("\n=== MINI RPG BATTLE ===")
    println("${hero.name} memiliki HP ${hero.hp}")
    println("Musuh memiliki HP $enemyHp")

    while (hero.isAlive() && enemyHp > 0) {
        println("\nPilih aksi:")
        println("1. Serang")
        println("2. Kabur")
        print("Pilihan: ")

        val choice = scanner.nextInt()

        if (choice == 1) {
            // Hero menyerang musuh
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage

            if (enemyHp < 0) {
                enemyHp = 0
            }

            println("HP musuh sekarang: $enemyHp")

            // Jika musuh masih hidup, musuh menyerang balik
            if (enemyHp > 0) {
                val enemyDamage = Random.nextInt(10, 21)

                println("Enemy menyerang balik!")
                hero.takeDamage(enemyDamage)

                println("Enemy memberikan $enemyDamage damage.")
                println("HP ${hero.name} sekarang: ${hero.hp}")
            }
        } else if (choice == 2) {
            println("${hero.name} memilih untuk kabur!")
            break
        } else {
            println("Pilihan tidak valid.")
        }
    }

    println("\n=== HASIL BATTLE ===")

    if (hero.isAlive() && enemyHp <= 0) {
        println("${hero.name} menang!")
    } else if (!hero.isAlive()) {
        println("Enemy menang!")
    } else {
        println("${hero.name} berhasil kabur.")
    }
}