package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_17 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val tara = Scanner(System.`in`)
            println("a kenarını giriniz : ")
            val a = tara.nextInt()
            println("b kenarını giriniz : ")
            val b = tara.nextInt()
            val alan = a * b
            val cevre = (a + b) * 2
            println("Çeversi : $cevre Alanı : $alan")
        }
    }
}