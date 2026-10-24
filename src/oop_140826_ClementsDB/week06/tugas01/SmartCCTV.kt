package oop_140826_ClementsDB.week06.tugas01

class SmartCCTV(override val name: String, override val id: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn(phone: SmartDevice) {
        startRecord()
    }

    override fun turnOff(phone: SmartDevice) {
    }

    override fun startRecord() {
    }

    override fun stopRecord() {

    }

}