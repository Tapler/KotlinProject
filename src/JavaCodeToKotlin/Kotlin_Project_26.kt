package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_26 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var indirim = 0.0
            var odeme = 0.0
            val tara = Scanner(System.`in`)
            println("Alışveriş miktarınızı giriniz : ")
            val avm = tara.nextDouble()
            when {
                avm <= 1000 -> indirim = avm * 5 / 100
                (avm > 1000) and (avm < 10000) -> indirim = avm * 8 / 100
                avm >= 10000 -> indirim = avm * 8.5 / 100
            }

            odeme = avm - indirim
            println("Ödenecek :$odeme")
        }
    }
}