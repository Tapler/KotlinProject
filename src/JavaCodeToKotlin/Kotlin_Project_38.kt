package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_38 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            println("Bir sayı girişi yapınız : ")
            val sayi = tara.nextInt()
            var fak = 1
            for (i in 1..sayi) {
                fak *= i
            }
            println(fak)
        }
    }
}