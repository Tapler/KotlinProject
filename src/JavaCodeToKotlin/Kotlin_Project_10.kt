package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_10 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            println("Bir sayı girişi yapınız : ")
            val sayi = tara.nextInt()
            println("2'ye bölümünden kalanı : ${sayi % 2}")
            println("2'ye bölümü : ${sayi / 2}")
        }
    }
}