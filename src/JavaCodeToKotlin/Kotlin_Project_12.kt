package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_12 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            println("M değerini giriniz : ")
            val sayi_m = tara.nextInt()
            println("N değerini giriniz : ")
            val sayi_n = tara.nextInt()
            println("Bölümü : ${sayi_m / sayi_n}")
            println("Kalanı : ${sayi_m % sayi_n}")
        }
    }
}