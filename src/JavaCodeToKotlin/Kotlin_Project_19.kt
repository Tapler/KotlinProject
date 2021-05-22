package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_19 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            println("Çapını giriniz : ")
            val R = tara.nextInt()
            val r = R / 2
            val alan = r * 3.14159f * r
            println("Alan : $alan")
        }
    }
}