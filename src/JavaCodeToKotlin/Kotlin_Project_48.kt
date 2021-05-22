package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_48 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            val oy = intArrayOf(0, 0, 0, 0, 0)
            for (i in 1..1362) {
                println("$i. Kişi Hoşgeldiniz, 0 ile 4 arasında oy kullanın.")
                when (tara.nextInt()) {
                    0 -> oy[0]++
                    1 -> oy[1]++
                    2 -> oy[2]++
                    3 -> oy[3]++
                    4 -> oy[4]++
                }
            }
            var eb = oy[0]
            var sira = 0
            for (i in 0 until 4) {
                println("$i. adayın oy sayısı ${oy[i]}")
                if (eb < oy[i]) {
                    eb = oy[i]
                    sira = i
                }
            }
        }
    }
}