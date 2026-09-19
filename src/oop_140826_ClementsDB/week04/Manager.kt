package oop_01_ClementsDB.week04

open class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat divisi")
    }
    override fun calculateBonus(): Int {
        super.calculateBonus() + 500000
        return calculateBonus()
    }
