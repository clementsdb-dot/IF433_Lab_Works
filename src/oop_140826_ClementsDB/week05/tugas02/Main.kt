package oop_140826_ClementsDB.week05.tugas02

fun main(){
    val ewallet = EWallet("AbrahamMelanggarHAM", 500000.0)
    val card = CreditCard("VitoBoluLapisPamulang", 100000.0)

    val caraPembayaran: List<PaymentMethod> = listOf(ewallet, card)

    println("--- Pembayaran ---")
    for (bayar in caraPembayaran) {
        bayar.processPayment(75000.0)
    }
}
