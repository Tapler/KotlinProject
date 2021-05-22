package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_31 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var tutar = 0
            val tara = Scanner(System.`in`)
            println("Ne kadar maaş alıyosun : ")
            val m = tara.nextInt()
            println("Kaç parça ürün sattın : ")
            val k = tara.nextInt()
            when {
                (k >= 1) and (k <= 10) -> tutar = m + k * 5
                (k >= 11) and (k <= 25) -> tutar =
                    m + k * 11
                (k >= 26) and (k <= 40) -> tutar = m + k * 11
                k > 40 -> tutar = m + k * 30
            }
            println("Ödeyeceğiniz tutar : $tutar")
        }
    }
}