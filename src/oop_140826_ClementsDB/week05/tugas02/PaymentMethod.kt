package oop_140826_ClementsDB.week05.tugas02

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}