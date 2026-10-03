package oop_140826_ClementsDB.week06

class Smartphone : Camera, Phone {
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sitem operasi Smartphone berhasil booting.")
    }
}