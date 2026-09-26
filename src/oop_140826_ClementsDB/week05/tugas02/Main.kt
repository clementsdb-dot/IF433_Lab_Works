package oop_140826_ClementsDB.week05.tugas02

fun main(){
    val ewallet = EWallet("AbrahamMelanggarHAM", 500000.0)
    val card = CreditCard("VitoBoluLapisPamulang", 100000.0)

    val caraPembayaran: List<PaymentMethod> = listOf(ewallet, card)

    println("--- Pembayaran ---")
    for (bayar in caraPembayaran) {
        bayar.processPayment(75000.0)

        when (bayar) {
            is EWallet -> {
                println("-> Membayar dengan E-Wallet, Nama Akun : ${bayar.accountName}")
                bayar.topUp(50000.0)
                bayar.processPayment(75000.0)
            }

            is CreditCard -> {
                println("-> Membayar dengan CreditCard, Nama Akun : ${bayar.accountName}")
                bayar.processPayment(75000.0)
            }
        }
    }
}
