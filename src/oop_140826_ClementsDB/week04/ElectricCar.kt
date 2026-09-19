package oop_01_ClementsDB.week04

open class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors) {

    override fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka")
    }
    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

    final override fun accelerate() {
        super.accelerate()
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%")
    }
}

