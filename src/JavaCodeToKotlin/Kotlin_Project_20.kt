package JavaCodeToKotlin

import java.util.*
import kotlin.math.sqrt

class Kotlin_Project_20 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            println("A kenarını giriniz :")
            val a = tara.nextInt()
            println("B kenarını giriniz :")
            val b = tara.nextInt()
            println("C kenarını giriniz :")
            val c = tara.nextInt()
            val cevre = a + b + c
            val alan = a * b / 2
            println("Alanı : $alan")
            println("Çevresi : $cevre")
            val hkare = a * a * b * b / (a * a + b * b)
            println("H Değeri : ${sqrt(hkare.toDouble())}")
        }
    }
}