package oop_01_ClementsDB.week04

open class Vehicle(val brand: String) {
    constructor() : this()

    var speed: Int = 0

    open fun accelerate() {
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }

    open fun honk() {
        println("Beep beep!")
    }
}

