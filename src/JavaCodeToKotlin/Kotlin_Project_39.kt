package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_39 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            println("Bir sayı giriniz : ")
            var sayi = tara.nextInt()
            var fak = 1

            val i = sayi
            while (i >= sayi) {
                fak *= i
                sayi--
            }

            println(fak)
        }
    }
}