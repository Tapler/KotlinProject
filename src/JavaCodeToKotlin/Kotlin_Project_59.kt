package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_59 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            carp()
        }

        fun carp() {
            val tara = Scanner(System.`in`)
            println("1. Sayının değerini giriniz : ")
            val sayi1 = tara.nextInt()
            println("2. Sayının değerini giriniz : ")
            val sayi2 = tara.nextInt()
            val carp = sayi1 * sayi2
            println(carp)
        }

    }
}