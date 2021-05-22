package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_61 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            toplam()
        }

        fun toplam(){
            val tara = Scanner(System.`in`)
            println("Bir sayı giriniz : ")
            val sayi = tara.nextInt()
            val karesi = sayi * sayi
            println("Karesi : $karesi")
        }

    }
}