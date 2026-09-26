package oop_140826_ClementsDB.week05.tugas02

class EWallet(accountName : String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount ) {
            balance - amount
            println("You've succesfully withdrawn $amount$, you know have $balance$")
        } else {
            println("Saldo tidak cukup, the amount you're trying to withdraw exceed the balance you have ($balance)")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("You've succesfully deposited $balance")
    }
}