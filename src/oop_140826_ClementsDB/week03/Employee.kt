package oop_140826_ClementsDB.week03

class Employee(val name: String ) {
    var salary: Int = 0
        set(value)
            if(value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
            } else {
                field = value
            }
}

var salary: Int = 0
    set(value){
        println("Mencoba set gaji ke: $value")
        this.salary = value
    }