package week01

fun main() {
    val gameTitle = "No Man's Sky"
    val price = 449999

    val finalPrice = ("${calculateDiscount(price)}")

    calculateDiscount(price)
    printReceipt(gameTitle, finalPrice)

    println("${printReceipt(gameTitle, finalPrice)}")

    val userNote: String? = null

    val usernoteLength = userNote?.length?: 0

    println("Tidak ada catatan $usernoteLength")

}

fun calculateDiscount(price: Int) = if (price > 500000) price - (price - 20/100) else price - (price - 10/100)

fun printReceipt(gameTitle: String, finalPrice: String) = println("Title : $gameTitle \nFinal Price : $finalPrice")

