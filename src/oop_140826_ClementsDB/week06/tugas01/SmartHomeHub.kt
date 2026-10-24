package oop_140826_ClementsDB.week06.tugas01

class SmartHomeHub () {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches(turnOff: MutableList<SmartDevice>.(Any) -> Unit) {
        for (device in devices) {
            if (device is Switchable) {
                devices.turnOff(device)
            }
        }
    }
}