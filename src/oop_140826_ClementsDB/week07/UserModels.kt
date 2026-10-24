package oop_140826_ClementsDB.week07

class RegularUser(val name: String, val age: Int) {
    println
}

data class DataUser(val name: String, val age: Int) {

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")
}