package oop_140826_ClementsDB.week06.tugas01

class SmartSpeaker(override val name: String, override val id: String, val song : String) : SmartDevice, Switchable {
    override fun turnOn(phone: SmartDevice) {
    }

    override fun turnOff(phone: SmartDevice) {
    }

    fun playMusic(song: String){
        println("Memutar lagu $song dari Spotify")
    }
}