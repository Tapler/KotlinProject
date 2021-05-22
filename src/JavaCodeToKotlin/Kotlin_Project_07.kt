package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_07 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            println("Birinci sayı girişini yapınız : ")
            val sayi1 = tara.nextInt()
            println("İkinci sayı girişini yapınız : ")
            val sayi2 = tara.nextInt()
            println("Toplam : ${sayi1 + sayi2}")
            println("Çarpım : ${sayi1 * sayi2}")
        }
    }
}