package oop_140826_ClementsDB.week05.tugas02

class CreditCard(accountName: String, val limit: Double, var usedAmount : Double = 0.0) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if ((usedAmount + amount) <= limit) {
            usedAmount += amount
            println("Success")
        } else {
            println("Transaction failed")
        }
    }
}