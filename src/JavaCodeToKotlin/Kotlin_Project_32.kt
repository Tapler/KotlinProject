package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_32 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            println("1-6 arası bir sayı griniz : ")
            val x = tara.nextInt()
            when {
                (x > 6) and (x < 1) -> println(" Hatalı Giriş ! ")
                x == 1 -> println("===\n=+=\n===")
                x == 2 -> println("==+\n===\n+==")
                x == 3 -> println("==+\n=+=\n+==")
                x == 4 -> println("+=+\n===\n+=+")
                x == 5 -> println("+=+\n=+=\n+=+")
                x == 6 -> println("+++\n===\n+++")
            }
        }
    }
}