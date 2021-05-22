package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_40 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            println("Bir sayı griiniz : ")
            val sayi = tara.nextInt()
            var number = 0
            var toplam = 0
            for (i in 1..sayi) {
                println("$i. sayı giriniz :")
                number = tara.nextInt()
                toplam += number
            }
            println("Toplam : $toplam")
        }
    }
}