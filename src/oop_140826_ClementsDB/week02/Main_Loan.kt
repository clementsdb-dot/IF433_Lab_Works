package oop_01_ClementsDB.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var loanDuration = scanner.nextInt()

    // Validasi: lama pinjam tidak boleh minus
    if (loanDuration < 0) {
        loanDuration = 1
    }

    val loan = Loan(bookTitle, borrower, loanDuration)

    println("\n=== Detail Peminjaman ===")
    println("Judul Buku     : ${loan.bookTitle}")
    println("Peminjam       : ${loan.borrower}")
    println("Lama Pinjam    : ${loan.loanDuration} hari")
    println("Total Denda    : Rp ${loan.calculateFine()}")
}