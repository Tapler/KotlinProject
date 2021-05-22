package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_75 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            println("A değerini belirleyiniz : ")
            val a = tara.nextInt()
            println("B değerini belirleyiniz : ")
            val d = tara.nextInt()
            println("N değerini belirleyiniz : ")
            val n = tara.nextInt()
            aritmekseri(a, d, n)
        }

        fun aritmekseri(a: Int, d: Int, n: Int) {
            for (i in 0 until n) {
                val sonuc = a + i * d
                println("Sounç : $sonuc")
            }
        }

    }
}