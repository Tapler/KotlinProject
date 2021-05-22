package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_18 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val pi = 22.toFloat() / 7
            println(pi)
            val tara = Scanner(System.`in`)
            println("Çemberin çapını giriniz : ")
            val R = tara.nextInt()
            val r = R / 2
            val cevre = 2 * pi * r
            println("Çevresi : $cevre")
        }
    }
}