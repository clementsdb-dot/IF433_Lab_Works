package oop_140826_ClementsDB.week06.tugas01

interface SmartDevice {
    val id : String
    val name: String
}

interface Switchable {
    abstract fun turnOn(phone: SmartDevice)

    abstract fun turnOff(phone: SmartDevice)
}

interface Recordable {
    abstract fun startRecord()

    fun stopRecord() { println("Perekaman dihentikan dan disimpan ke Cloud.")}
}