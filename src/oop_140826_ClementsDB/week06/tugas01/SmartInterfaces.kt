package oop_140826_ClementsDB.week06.tugas01

interface SmartDevice {
    val id : String
    val name: String
}

interface Switchable {
    fun turnOn(phone: SmartDevice)

    fun turnOff(phone: SmartDevice)
}

interface Recordable {
    fun startRecord()

    fun stopRecord() {
        println("Perekaman dihentikan dan disimpan ke Cloud.")}
}