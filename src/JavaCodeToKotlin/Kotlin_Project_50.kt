package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_50 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            // TODO code application logic here
            val snc = arrayOf(
                intArrayOf(0, 0, 0, 0, 0),
                intArrayOf(0, 0, 0, 0, 0),
                intArrayOf(0, 0, 0, 0, 0),
                intArrayOf(0, 0, 0, 0, 0),
                intArrayOf(0, 0, 0, 0, 0),
                intArrayOf(0, 0, 0, 0, 0),
                intArrayOf(0, 0, 0, 0, 0)
            )
            val tara = Scanner(System.`in`)
            println("Kaç kişi oy kullanacak")
            val n = tara.nextInt()
            for (i in 0 until n) {
                for (j in 0 until 7) {
                    println("${j + 1}.soruyu cevapla"
                                + "1.Olumlu/2.olumlu/3.tarafsız"
                                + "4.olumsuz/5olumsuz.")
                    val x = tara.nextInt()
                    snc[j][x - 1]++
                }
            }
            println("Soru No/ÇO/O/T/OS/ÇOS")
            for (i in 0 until 7) {
                println("${i+1}soruya:")
                for (j in 0 until 5) {
                    println("${snc[i][j] * 100 / n}/n")
                }
                println()
            }
        }
    }
}