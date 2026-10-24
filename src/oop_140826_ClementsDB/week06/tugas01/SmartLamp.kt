package oop_140826_ClementsDB.week06.tugas01

class SmartLamp(override val name: String, override val id: String) : SmartDevice, Switchable {
    override fun turnOn(phone: SmartDevice) {
    }

    override fun turnOff(phone: SmartDevice) {
    }

}