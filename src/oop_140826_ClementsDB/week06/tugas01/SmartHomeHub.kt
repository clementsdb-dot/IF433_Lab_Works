package oop_140826_ClementsDB.week06.tugas01

class SmartHomeHub () {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff(device)
            }
        }
    }


    fun activateSecurityMode() {
        for (device in devices) {
            if(device is Recordable) {
                device.startRecord()
            }

            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}