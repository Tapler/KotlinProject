package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_37 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            println("Bir metin giriniz : ")
            val metin = tara.nextLine()
            for (i in 1..100) {
                println("$i. $metin")
            }
        }
    }
}