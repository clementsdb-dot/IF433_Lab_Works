package oop_01_ClementsDB.week01

fun main() {
    val gameTitle = "No Man's Sky"
    val price = 449999
}

fun printReceipt(gameTitle: String, finalPrice: Int) println("Title : $gameTitle \nFinal Price : $finalPrice")

fun calculateDiscount(price: Int) if (price > 500000) price - (price - 20/100) else price - (price - 10/100)