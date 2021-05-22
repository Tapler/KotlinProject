package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_11 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            println("Bir sayı girişi yapınız : ")
            val sayi = tara.nextInt()
            println("5'e bölümünden kalanı : ${sayi % 5}")
            println("5'e bölümü : ${sayi / 5}")
        }
    }
}