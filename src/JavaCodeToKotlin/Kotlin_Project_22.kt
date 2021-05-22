package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_22 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            println("Bir sayı giriniz : ")
            val sayi = tara.nextInt()
            val b = sayi % 10
            val o = sayi / 10
            when (o) {
                0 -> print("-")
                1 -> print("on")
                2 -> print("yirmi")
                3 -> print("otuz")
                4 -> print("kırk")
                5 -> print("elli")
                6 -> print("altmış")
                7 -> print("yetmiş")
                8 -> print("seksen")
                9 -> print("doksan")
                else -> println("hata")
            }
            when (b) {
                0 -> println("sıfır")
                1 -> println("bir")
                2 -> println("iki")
                3 -> println("üç")
                4 -> println("dört")
                5 -> println("beş")
                6 -> println("altı")
                7 -> println("yedi")
                8 -> println("sekiz")
                9 -> println("dokuz")
                else -> println("hata")
            }
        }
    }
}