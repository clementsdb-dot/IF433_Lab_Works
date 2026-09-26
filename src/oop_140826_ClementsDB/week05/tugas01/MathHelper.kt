package oop_140826_ClementsDB.week05.tugas01

class MathHelper (sisi: Int, panjang: Int, lebar: Int, jarijari: Double){
    fun hitungLuas(sisi: Int) : Int{
        return sisi * sisi
    }

    fun hitungLuas(panjang: Int, lebar: Int) : Int{
        return panjang * lebar
    }

    fun hitungLuas(jarijari: Double) : Double{
        return 3.14 * jarijari * jarijari
    }
}