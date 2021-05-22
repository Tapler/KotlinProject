package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_28 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val tara = Scanner(System.`in`)
            println("Notunuzu giriniz : ")
            val not = tara.nextInt()
            when {
                (not > 0) and (not <= 69) -> println("Belge Alamaz!")
                (not >= 70) and (not <= 84) -> println("Teşekkür Belgesi")
                (not >= 85) and (not <= 100) -> println("Taktir Belgesi")
            }
        }
    }
}