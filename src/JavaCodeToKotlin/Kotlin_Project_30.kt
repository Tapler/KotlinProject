package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_30 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var tutar = 0
            val tara = Scanner(System.`in`)
            println("Mesaj başı ücret : ")
            val m = tara.nextInt()
            println("20 mesajdan sonra ki indirim oranı : ")
            val n = tara.nextInt()
            println("Kaç tane mesaj attın : ")
            val r = tara.nextInt()
            if (n <= 20) tutar = m * n
            else if (n > 20) tutar = 20 * m + (n - 20) * (m - m * r / 100)
            println("Ödeyeceğiniz tutar : $tutar")
        }
    }
}